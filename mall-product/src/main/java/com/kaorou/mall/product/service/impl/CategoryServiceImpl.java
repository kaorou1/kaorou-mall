package com.kaorou.mall.product.service.impl;

import com.kaorou.mall.product.dao.CategoryDao;
import com.kaorou.mall.product.entity.CategoryEntity;
import com.kaorou.mall.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kaorou.common.utils.PageUtils;
import com.kaorou.common.utils.Query;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> getTreeList() {
        //1. 查询所有分类
        List<CategoryEntity> list = baseMapper.selectList(null);

        //2. 组装父子结构
        List<CategoryEntity> level1 = list.stream()
                .filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .map(level1Entity -> {
                    //这里设置所有的子级菜单
                    level1Entity.setChildren(getChildren(level1Entity, list));
                    return level1Entity;
                }).sorted((menu1, menu2) -> {
                    return menu1.getSort() - menu2.getSort();
                })
                .collect(Collectors.toList());

        return level1;
    }

    @Override
    public void removeLogicByIds(List<Long> asList) {
        baseMapper.deleteBatchIds(asList);
    }


    /**
     * 找到当前菜单的子菜单（含多个下级）
     * @param root
     * @param all
     * @return
     */
    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all){

        List<CategoryEntity> children = all.stream()
                .filter(categoryEntity -> Objects.equals(categoryEntity.getParentCid(), root.getCatId()))
                .map(categoryEntity -> {
                    categoryEntity.setChildren(getChildren(categoryEntity, all));
                    return categoryEntity;
                })
                .sorted((menu1, menu2) -> {
                    return menu1.getSort() - menu2.getSort();
                })
                .collect(Collectors.toList());

        return children;
    }

}
package com.kaorou.mall.product.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import com.kaorou.mall.product.entity.CategoryEntity;
import com.kaorou.mall.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kaorou.common.utils.PageUtils;
import com.kaorou.common.utils.R;



/**
 * 商品三级分类
 *
 * @author kaorou
 * @email whyxx4583@gmail.com
 * @date 2024-03-20 11:12:10
 */
@RestController
@RequestMapping("product/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    /**
     * 查询所以得三级分类，以树形结构返回
     */
    @RequestMapping("/list/tree")
    public R getTreeList(){
        List<CategoryEntity> tree = categoryService.getTreeList();

        return R.ok().put("tree", tree);
    }


    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = categoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] catIds){
        //改用逻辑删除
		//categoryService.removeByIds(Arrays.asList(catIds));
        categoryService.removeLogicByIds(Arrays.asList(catIds));


        return R.ok();
    }

}

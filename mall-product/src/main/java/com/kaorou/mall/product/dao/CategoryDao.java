package com.kaorou.mall.product.dao;

import com.kaorou.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author kaorou
 * @email whyxx4583@gmail.com
 * @date 2024-03-19 17:43:38
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

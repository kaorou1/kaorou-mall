package com.kaorou.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kaorou.common.utils.PageUtils;
import com.kaorou.mall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author kaorou
 * @email whyxx4583@gmail.com
 * @date 2024-03-19 17:43:38
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


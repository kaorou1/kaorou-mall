package com.kaorou.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kaorou.common.utils.PageUtils;
import com.kaorou.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author kaorou
 * @email whyxx4583@gmail.com
 * @date 2024-03-19 17:43:38
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


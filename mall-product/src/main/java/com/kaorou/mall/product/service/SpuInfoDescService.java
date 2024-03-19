package com.kaorou.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kaorou.common.utils.PageUtils;
import com.kaorou.mall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author kaorou
 * @email whyxx4583@gmail.com
 * @date 2024-03-19 17:43:37
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


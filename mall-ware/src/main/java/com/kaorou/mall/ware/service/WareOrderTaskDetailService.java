package com.kaorou.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kaorou.common.utils.PageUtils;
import com.kaorou.mall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author kaorou
 * @email whyxx4583@gmail.com
 * @date 2024-03-20 14:07:40
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


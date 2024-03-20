package com.kaorou.mall.order.dao;

import com.kaorou.mall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author kaorou
 * @email whyxx4583@gmail.com
 * @date 2024-03-20 13:58:02
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

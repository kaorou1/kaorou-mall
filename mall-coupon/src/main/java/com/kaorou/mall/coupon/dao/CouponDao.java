package com.kaorou.mall.coupon.dao;

import com.kaorou.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author kaorou
 * @email whyxx4583@gmail.com
 * @date 2024-03-20 13:39:02
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

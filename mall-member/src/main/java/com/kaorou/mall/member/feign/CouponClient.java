package com.kaorou.mall.member.feign;

import com.kaorou.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("mall-coupon")
public interface CouponClient {

    @RequestMapping("/coupon/coupon/getKaorou")
    public R getKaorou();

}

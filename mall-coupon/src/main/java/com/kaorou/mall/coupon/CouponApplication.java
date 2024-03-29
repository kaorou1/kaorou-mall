package com.kaorou.mall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@EnableDiscoveryClient
@MapperScan("com.kaorou.mall.coupon.dao")
@SpringBootApplication
public class CouponApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(CouponApplication.class, args);
    }
}

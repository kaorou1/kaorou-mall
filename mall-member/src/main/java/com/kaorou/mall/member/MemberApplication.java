package com.kaorou.mall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

@EnableFeignClients(basePackages = "com.kaorou.mall.member.feign")
@EnableDiscoveryClient
@MapperScan("com.kaorou.mall.member.dao")
@SpringBootApplication
public class MemberApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MemberApplication.class, args);
    }
}

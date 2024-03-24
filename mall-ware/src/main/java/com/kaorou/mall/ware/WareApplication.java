package com.kaorou.mall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@EnableDiscoveryClient
@MapperScan("com.kaorou.mall.ware.dao")
@SpringBootApplication
public class WareApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(WareApplication.class, args);

    }
}

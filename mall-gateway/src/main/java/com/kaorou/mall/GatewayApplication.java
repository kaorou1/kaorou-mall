package com.kaorou.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class GatewayApplication {
    public static void main(String[] args) {

//        System.out.println("Hello world!");
        ConfigurableApplicationContext run = SpringApplication.run(GatewayApplication.class, args);
    }
}
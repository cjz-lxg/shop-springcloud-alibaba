package io.binghe.shop.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement(proxyTargetClass = true)
@MapperScan(value = { "io.binghe.shop.user.mapper" })
@EnableDiscoveryClient
@EnableAsync
public class UserStarter {
    public static void main(String[] args){
        SpringApplication.run(UserStarter.class, args);
    }

}

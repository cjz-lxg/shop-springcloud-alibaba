package io.binghe.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * @author binghe (公众号：冰河技术)
 * @version 1.0.0
 * @description 服务网关启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayStarter {
    public static void main(String[] args){
        SpringApplication.run(GatewayStarter.class, args);
    }
}


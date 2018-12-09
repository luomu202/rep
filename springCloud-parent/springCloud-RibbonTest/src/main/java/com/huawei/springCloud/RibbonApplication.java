package com.huawei.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Luomu
 * @create 2018-12-01 20:58
 **/
@EnableFeignClients //开启feignclient
@SpringBootApplication
@EnableDiscoveryClient
public class RibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonApplication.class, args);
    }

//
//    @Bean
//    @LoadBalanced //开始客户端负载均衡
//    public RestTemplate restTemplate(){
//        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
//    }
}

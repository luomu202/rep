package com.huawei.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Luomu
 * @create 2018-12-01 15:48
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
public class GovernClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(GovernClientApplication.class,args);
    }
}

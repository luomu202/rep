package com.huawei.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Luomu
 * @create 2018-12-01 13:20
 **/
@EnableEurekaServer
@SpringBootApplication
public class GovernCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(GovernCenterApplication.class,args);
    }
}

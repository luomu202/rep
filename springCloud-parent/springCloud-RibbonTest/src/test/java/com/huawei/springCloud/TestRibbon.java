package com.huawei.springCloud;

/**
 * @author Luomu
 * @create 2018-12-01 21:04
 **/

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestRibbon {

    @Autowired
    RestTemplate restTemplate;

    @Test
    public void testRibbon() {
        //确定要获得的服务名
        String serviceId = "SPRINGCLOUD-CLIENT";
        for (int i = 0; i < 10; i++) {
            //ribbon客户端从eurekaServer中获取服务列表，根据服务名称获取服务列表
            ResponseEntity<String> forEntity = restTemplate.getForEntity("http://" + serviceId + "/hello/1", String.class);
            String body = forEntity.getBody();
            System.err.println(body);
        }
    }
}

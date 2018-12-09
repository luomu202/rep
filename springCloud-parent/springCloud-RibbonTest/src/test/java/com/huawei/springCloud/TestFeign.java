package com.huawei.springCloud;

/**
 * @author Luomu
 * @create 2018-12-01 21:04
 **/

import com.huawei.springCloud.fenignClient.RFClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestFeign {

    @Autowired
    RFClient rfClient; //接口代理对象，由Feign生成代理对象

    @Test
    public void testRibbon() {
        String msg = rfClient.getMsg();
        System.err.println(msg);
    }
}

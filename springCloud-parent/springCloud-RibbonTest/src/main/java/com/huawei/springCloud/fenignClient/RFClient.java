package com.huawei.springCloud.fenignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Luomu
 * @create 2018-12-01 22:03
 **/
@FeignClient(value = "SPRINGCLOUD-CLIENT")
public interface RFClient {
    @GetMapping("/hello/1")
    public String getMsg();

}

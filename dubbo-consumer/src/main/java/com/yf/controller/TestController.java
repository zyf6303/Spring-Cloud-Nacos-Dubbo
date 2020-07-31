package com.yf.controller;

import com.yf.service1.api.Service1;
import com.yf.service2.api.Service2;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Yang_Vincent
 * @Date 2020/7/31 17:53
 */

@RestController
public class TestController {

    @Value("${common.name}")
    String name;
    @Value("${common.age}")
    String age;

    @Reference
    Service1 service1;

    @Reference
    Service2 service2;

    @GetMapping("/service2")
    public String getService2(){
        String s = this.service2.getService2();
        return "调用来自： " + s;
    }
    @GetMapping("/service1")
    public String getService1(){
        //通过service1 调用service2
        return "调用来自： " + service1.getService1();
    }
    @GetMapping("/ser")
    public String getConfig(){
        //通过service1 调用service2
        return "配置来自中心： "+name+"|"+age;
    }
}

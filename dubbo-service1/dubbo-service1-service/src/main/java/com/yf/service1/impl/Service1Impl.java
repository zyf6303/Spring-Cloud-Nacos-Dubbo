package com.yf.service1.impl;

import com.yf.service1.api.Service1;
import com.yf.service2.api.Service2;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author Yang_Vincent
 * @Date 2020/7/31 19:28
 */
@Service
public class Service1Impl implements Service1 {

    @Reference
    Service2 service2;

    @Override
    public String getService1() {
        return "service1 调 | " + service2.getService2();
    }
}

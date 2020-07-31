package com.yf.service2.api.impl;

import com.yf.service2.api.Service2;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author Yang_Vincent
 * @Date 2020/7/31 18:12
 */

@Service
public class Service2Impl implements Service2 {

    @Override
    public String getService2() {
        return "service2";
    }
}

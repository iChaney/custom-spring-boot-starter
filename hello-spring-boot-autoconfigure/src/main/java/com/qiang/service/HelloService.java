package com.qiang.service;

import com.qiang.autoconfigure.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 这是一个service
 *
 * @author liq
 * @date 2022/1/28 15:32
 */
public class HelloService {
    @Autowired
    HelloProperties helloProperties;

    public String sayHello(String name) {
        return helloProperties.getPrefix() + name + helloProperties.getSuffix();
    }
}

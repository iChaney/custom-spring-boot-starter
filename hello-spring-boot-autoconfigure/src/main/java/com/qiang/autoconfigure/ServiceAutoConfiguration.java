package com.qiang.autoconfigure;

import com.qiang.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liq
 * @date 2022/1/28 15:36
 */
@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties({HelloProperties.class})
public class ServiceAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(name = "hello.prefix")
    public HelloService helloService() {
        return new HelloService();
    }
}

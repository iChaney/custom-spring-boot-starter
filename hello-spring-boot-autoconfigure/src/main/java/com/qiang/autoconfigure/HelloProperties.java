package com.qiang.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author liq
 * @date 2022/1/28 15:47
 */
@ConfigurationProperties(prefix = "hello")
public class HelloProperties {
    private String prefix;

    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}

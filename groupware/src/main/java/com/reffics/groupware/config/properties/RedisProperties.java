package com.reffics.groupware.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "reffics.redis")
public class RedisProperties {

    private String redisHost;

    private int redisPort;

    private String redisPassword;
}

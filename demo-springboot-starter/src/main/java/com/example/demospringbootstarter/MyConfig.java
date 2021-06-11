package com.example.demospringbootstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Don
 * @date 2021/5/25.
 */
@Configuration
@EnableConfigurationProperties(MyProperties.class)
@ConditionalOnProperty(
        prefix = "demo",
        name = "isopen",
        havingValue = "true"
)
public class MyConfig {
    private final MyProperties myProperties;

    public MyConfig(MyProperties myProperties) {
        this.myProperties = myProperties;
    }

    @Bean
    public MyService demoService(){
        return new MyService(myProperties.getName(), myProperties.getAge());
    }
}

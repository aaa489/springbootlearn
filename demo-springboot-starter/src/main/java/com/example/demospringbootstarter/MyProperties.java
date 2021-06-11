package com.example.demospringbootstarter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Don
 * @date 2021/5/25.
 */
@ConfigurationProperties(prefix = "my")
public class MyProperties {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package com.example.demospringbootstarter;

/**
 * @author Don
 * @date 2021/5/25.
 */
public class MyService {
    public String name;
    public int age;
    public MyService(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String hello(){
        return this.name + "!  " + age;
    }
}

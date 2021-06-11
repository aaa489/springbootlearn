package com.example.testdemo.beanutil;

import cn.hutool.core.bean.copier.BeanCopier;
import cn.hutool.core.bean.copier.CopyOptions;
import com.example.testdemo.dto.Person;
import com.example.testdemo.dto.PersonPO;
import org.springframework.beans.BeanUtils;
import org.springframework.util.StopWatch;

/**
 * @author Don
 * @date 2021/6/3.
 */
public class Tester {

    public static void copyBySpringBeanUtils(){
        Person p1 = new Person();
        p1.setAddress("hangzhou");
        p1.setName("don");
        p1.setAge(20);
        p1.setSex("man");
        PersonPO p2 = new PersonPO();
        StopWatch usedTime = new StopWatch();
        usedTime.start();
        for (int i = 0; i < 100; i++){
            BeanUtils.copyProperties(p1, p2);
        }
        usedTime.stop();
        System.out.println(usedTime.getTotalTimeMillis() + "毫秒");
    }

    public static void copyByApacheBeanUtils(){
        Person p1 = new Person();
        p1.setAddress("hangzhou");
        p1.setName("don");
        p1.setAge(20);
        p1.setSex("man");
        PersonPO p2 = new PersonPO();
        StopWatch usedTime = new StopWatch();
        usedTime.start();
        for (int i = 0; i < 100; i++){
            try{
                org.apache.commons.beanutils.BeanUtils.copyProperties(p2, p1);
            }
            catch (Exception ex){

            }
        }
        usedTime.stop();
        System.out.println(usedTime.getTotalTimeMillis() + "毫秒");
    }

    public static void copyByHuToolBeanUtils(){
        Person p1 = new Person();
        p1.setAddress("hangzhou");
        p1.setName("don");
        p1.setAge(20);
        p1.setSex("man");
        PersonPO p2 = new PersonPO();
        StopWatch usedTime = new StopWatch();
        usedTime.start();
        for (int i = 0; i < 100; i++){
            BeanCopier.create(p1, p2, CopyOptions.create().ignoreNullValue()).copy();
        }
        usedTime.stop();
        System.out.println(usedTime.getTotalTimeMillis() + "毫秒");
    }

    public static void copyByCgLibBeanUtils(){
        Person p1 = new Person();
        p1.setAddress("hangzhou");
        p1.setName("don");
        p1.setAge(20);
        p1.setSex("man");
        PersonPO p2 = new PersonPO();
        StopWatch usedTime = new StopWatch();
        usedTime.start();
        org.springframework.cglib.beans.BeanCopier beanCopier = org.springframework.cglib.beans.BeanCopier.create(Person.class, PersonPO.class, false);
        for (int i = 0; i < 100; i++){
            beanCopier.copy(p1, p2, null);
        }
        usedTime.stop();
        System.out.println(usedTime.getTotalTimeMillis() + "毫秒");
    }

    public static void copyByMaperStructUtils(){
        Person p1 = new Person();
        p1.setAddress("hangzhou");
        p1.setName("don");
        p1.setAge(20);
        p1.setSex("man");
        PersonPO p2 = new PersonPO();
        StopWatch usedTime = new StopWatch();
        usedTime.start();
        for (int i = 0; i < 100; i++){
            p2 = PersonConverter.INSTANCE.domain2dto(p1);
        }
        usedTime.stop();
        System.out.println(usedTime.getTotalTimeMillis() + "毫秒");
    }
}

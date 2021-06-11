package com.example.testdemo;

import com.example.testdemo.beanutil.Tester;
import com.example.testdemo.log.LogTester;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cglib.core.DebuggingClassWriter;

@SpringBootTest
class TestdemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testCopyBySpringBeanUtils(){
        Tester.copyBySpringBeanUtils();
        Tester.copyByApacheBeanUtils();
        Tester.copyByHuToolBeanUtils();
        Tester.copyByCgLibBeanUtils();
        Tester.copyByMaperStructUtils();
    }

    @Test
    public void testLog(){
        LogTester logTester = new LogTester();
        logTester.outPut();
    }

}

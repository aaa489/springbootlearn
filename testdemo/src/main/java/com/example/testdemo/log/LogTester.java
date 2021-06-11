package com.example.testdemo.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;

/**
 * @author Don
 * @date 2021/6/7.
 */
public class LogTester {
    Logger logger = LoggerFactory.getLogger(LogTester.class);

    public void outPut(){
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i = 0; i < 100000; i++){
            logger.info("log4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2outputlog4j2output ");
        }
        stopWatch.stop();
        System.out.println("总耗时:" + stopWatch.getTotalTimeMillis() + "毫秒");
    }
}

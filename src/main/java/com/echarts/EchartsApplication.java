package com.echarts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Date 2019/11/13 13:13
 */
@SpringBootApplication
@ComponentScan(value = "com.echarts")
public class EchartsApplication {
    public static void main(String[] args) {
        SpringApplication.run(EchartsApplication.class,args);
    }
}

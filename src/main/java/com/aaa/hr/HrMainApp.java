package com.aaa.hr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * className:HrMainApp
 * discription:
 * author:zn
 * createTime:2019-01-14 09:33
 */
@SpringBootApplication
@MapperScan("com.aaa.hr.dao")
public class HrMainApp {

    public static void main(String[] args) {
        SpringApplication.run(HrMainApp.class,args);
    }
}

package com.example.ifit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "com.example.ifit.mapper")
@EnableTransactionManagement
@EnableAutoConfiguration
public class IfitApplication {

    public static void main(String[] args) {
        SpringApplication.run(IfitApplication.class, args);
    }

}

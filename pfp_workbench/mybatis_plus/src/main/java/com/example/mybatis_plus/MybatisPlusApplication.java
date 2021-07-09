package com.example.mybatis_plus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author :
 */
@SpringBootApplication
@MapperScan("com.example.mybatis_plus.mapper")
@ComponentScan(value = {"com.example.mybatis_plus.service.impl"})
public class MybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusApplication.class, args);
    }

}

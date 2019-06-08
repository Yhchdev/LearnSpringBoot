package com.example.springboot08mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springboot08mybatisplus.Mapper")
public class Springboot08MybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot08MybatisplusApplication.class, args);
    }

}

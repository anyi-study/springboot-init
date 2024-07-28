package com.codej.springbootinitcode;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.codej.springbootinitcode.mapper")
public class SpringbootInitCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootInitCodeApplication.class, args);
    }

}

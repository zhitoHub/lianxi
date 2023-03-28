package com.ate;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ate.mapper")

public class LianxiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LianxiApplication.class, args);
    }

}

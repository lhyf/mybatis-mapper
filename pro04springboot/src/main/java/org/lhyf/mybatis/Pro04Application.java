package org.lhyf.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = {"org.lhyf.mybatis.mapper"})
public class Pro04Application {

    public static void main(String[] args) {
        SpringApplication.run(Pro04Application.class, args);
    }
}

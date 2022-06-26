package com.icho.file;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: icho
 * @Date: 2022/6/26 15:44
 * @Describe:
 */
@SpringBootApplication
@MapperScan("com.icho.file.mapper")
public class FileApplication {
    public static void main(String[] args) {
        SpringApplication.run(FileApplication.class, args);
    }
}

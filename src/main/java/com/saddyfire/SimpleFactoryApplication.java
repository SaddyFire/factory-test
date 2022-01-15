package com.saddyfire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author SaddyFire
 * @date 2022/1/10
 * @TIME:14:42
 */
@SpringBootApplication
public class SimpleFactoryApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleFactoryApplication.class,args);
        System.out.println("启动成功");
    }
}

package com.boll.miaomiao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 项目启动类
 */
@EnableAsync
@SpringBootApplication
public class MiaomiaoMachineApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiaomiaoMachineApplication.class, args);
    }

}

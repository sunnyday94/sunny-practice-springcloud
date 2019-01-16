package com.sunny.springcloud.springcloudservicehi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.sunny.springcloud"})
public class SpringcloudServiceHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServiceHiApplication.class, args);
    }
}

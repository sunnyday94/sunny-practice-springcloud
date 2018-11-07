package com.sunny.springcloud.springcloudservicehi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"com.sunny.springcloud"})
@EnableDiscoveryClient
public class SpringcloudServiceHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServiceHiApplication.class, args);
    }
}

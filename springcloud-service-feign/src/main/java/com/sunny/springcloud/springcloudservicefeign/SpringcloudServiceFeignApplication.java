package com.sunny.springcloud.springcloudservicefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.sunny.springcloud"})
@EnableDiscoveryClient
@EnableFeignClients
public class SpringcloudServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServiceFeignApplication.class, args);
    }
}

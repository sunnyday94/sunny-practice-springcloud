package com.sunny.springcloud.springcloudservicefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.sunny.springcloud"})
@EnableEurekaClient
@EnableFeignClients
public class SpringcloudServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServiceFeignApplication.class, args);
    }
}

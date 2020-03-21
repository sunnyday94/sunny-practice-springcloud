package com.sunny.springcloud.springcloudservicehi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication(scanBasePackages = {"com.sunny.springcloud"})
@EnableEurekaClient
@EnableHystrix //开启断路器
public class SpringcloudServiceHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServiceHiApplication.class, args);
    }
}

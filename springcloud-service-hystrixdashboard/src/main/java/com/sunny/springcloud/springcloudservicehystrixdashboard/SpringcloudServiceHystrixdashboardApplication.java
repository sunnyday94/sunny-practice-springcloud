package com.sunny.springcloud.springcloudservicehystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication(scanBasePackages = "com.sunny.springcloud")
@EnableHystrixDashboard
public class SpringcloudServiceHystrixdashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServiceHystrixdashboardApplication.class, args);
    }

}

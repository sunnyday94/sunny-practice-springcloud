package com.sunny.springcloud.springcloudserviceribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = {"com.sunny.springcloud"})
@EnableDiscoveryClient
@EnableHystrix
@EnableHystrixDashboard
public class SpringcloudServiceRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServiceRibbonApplication.class, args);
    }

    /**
     * @Description:开启负载均衡
     * @Author: sunny
     * @Date: 2018/10/29 17:47
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}

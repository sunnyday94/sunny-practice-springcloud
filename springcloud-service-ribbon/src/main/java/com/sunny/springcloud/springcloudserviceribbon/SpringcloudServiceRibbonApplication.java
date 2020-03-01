package com.sunny.springcloud.springcloudserviceribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

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
    
    
    /* *
     * @Author sunny
     * @Description  负载均衡默认是轮询，这里手动指定为随机
     * @Date 21:22 2020/3/1
     * @Param []
     * @return com.netflix.loadbalancer.IRule
     **/
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}

package com.sunny.springcloud.springcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @description
 * @author sunny
 * @create 2018/12/10
 * @since 1.0.0
 */
@SpringBootApplication(scanBasePackages = {"com.sunny.springcloud"})
@EnableConfigServer
public class SpringcloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigServerApplication.class, args);
    }


}
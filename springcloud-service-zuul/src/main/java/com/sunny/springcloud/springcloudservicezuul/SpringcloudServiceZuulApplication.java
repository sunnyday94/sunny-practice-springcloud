/**
 * FileName: SpringcloudServiceZuulApplication
 * Author:   sunny
 * Date:     2018/12/8 19:16
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.springcloudservicezuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 〈一句话功能简述〉
 * @author sunny
 * @create 2018/12/8
 * @since 1.0.0
 */
@SpringBootApplication(scanBasePackages = {"com.sunny.springcloud"})
@EnableDiscoveryClient
@EnableZuulProxy
public class SpringcloudServiceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServiceZuulApplication.class, args);
    }
}
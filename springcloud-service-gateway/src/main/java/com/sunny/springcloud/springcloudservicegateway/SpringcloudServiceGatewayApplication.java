/**
 * FileName: SpringcloudServiceGatewayApplication
 * Author:   sunny
 * Date:     2019/1/16 23:37
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.springcloudservicegateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description
 * @author sunny
 * @create 2019/1/16
 * @since 1.0.0
 */
@SpringBootApplication(scanBasePackages = {"com.sunny.springcloud"})
public class SpringcloudServiceGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServiceGatewayApplication.class, args);
    }

}
/**
 * FileName: SpringcloudServiceGatewayPredicateApplication
 * Author:   sunny
 * Date:     2019/1/21 16:48
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.springcloudservicegatewaypredicate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description
 * @author sunny
 * @create 2019/1/21
 * @since 1.0.0
 */
@SpringBootApplication(scanBasePackages = {"com.sunny.springcloud"})
public class SpringcloudServiceGatewayPredicateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudServiceGatewayPredicateApplication.class, args);
    }

}
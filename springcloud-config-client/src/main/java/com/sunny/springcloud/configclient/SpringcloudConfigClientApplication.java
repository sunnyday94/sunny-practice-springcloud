/**
 * FileName: SpringcloudConfigClientApplication
 * Author:   sunny
 * Date:     2018/12/10 17:28
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description
 * @author sunny
 * @create 2018/12/10
 * @since 1.0.0
 */
@SpringBootApplication(scanBasePackages = {"com.sunny.springcloud"})
public class SpringcloudConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigClientApplication.class, args);
    }
}
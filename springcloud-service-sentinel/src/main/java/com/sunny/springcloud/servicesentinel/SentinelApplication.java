/**
 * FileName: SentinelApplication Author:   sunnyday Date:     2019/7/21 19:14 Description:
 * Sentinel启动类 History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.servicesentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Sentinel启动类〉
 *
 * @author sunnyday
 * @create 2019/7/21
 * @since 1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelApplication.class, args);
    }
}

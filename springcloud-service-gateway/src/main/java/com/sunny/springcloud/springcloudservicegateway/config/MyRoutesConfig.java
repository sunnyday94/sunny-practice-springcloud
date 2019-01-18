/**
 * FileName: MyRoutesConfig
 * Author:   sunny
 * Date:     2019/1/18 14:55
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.springcloudservicegateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description
 * @author sunny
 * @create 2019/1/18
 * @since 1.0.0
 */
@Configuration
public class MyRoutesConfig {

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder){
        final String httpUri = "http://httpbin.org:80";
        return builder.routes()
                .route(
                        p -> p.path("/get").filters(
                                f -> f.addRequestHeader("NAME", "SUNNY")
                        ).uri(httpUri)
                )
                .route(
                        p -> p.host("*.hystrix.com").filters(
                                f -> f.hystrix(
                                        config -> config.setName("mycmd").setFallbackUri("forward:/fallback")
                                )
                        ).uri(httpUri)

                )
                .build();
    }
}
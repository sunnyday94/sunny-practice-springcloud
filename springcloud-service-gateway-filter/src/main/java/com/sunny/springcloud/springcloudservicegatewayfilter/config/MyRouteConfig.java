/**
 * FileName: MyRouteConfig
 * Author:   sunny
 * Date:     2019/3/4 14:08
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.springcloudservicegatewayfilter.config;

import com.sunny.springcloud.springcloudservicegatewayfilter.filter.RequestTimeFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description
 * @author sunny
 * @create 2019/3/4
 * @since 1.0.0
 */
@Configuration
public class MyRouteConfig {


    @Bean
    public RouteLocator  myRoutes(RouteLocatorBuilder myBuilder){
        return myBuilder
                .routes()
                .route(p ->
                    p.path("/customer/**")
                    .filters(f ->
                                f.filter(new RequestTimeFilter())
                                .addRequestHeader("X-Response-Default-Name", "Default-Sunny")
                    )
                    .uri("http://httpbin.org:80/get").order(0).id("customer_filter_router")

                )
                .build();
    }


}
/**
 * FileName: RequestGatewayFilterFactoryConfig
 * Author:   sunny
 * Date:     2019/3/4 16:34
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.springcloudservicegatewayfilter.config;

import com.sunny.springcloud.springcloudservicegatewayfilter.filter.factory.RequestTimeGatewayFilterFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description
 * @author sunny
 * @create 2019/3/4
 * @since 1.0.0
 */
@Configuration
public class RequestTimeGatewayFilterFactoryConfig {

    @Bean
    public RequestTimeGatewayFilterFactory myGatewayFilterFactory(){
        return new RequestTimeGatewayFilterFactory();
    }
}
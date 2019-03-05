/**
 * FileName: FilterFactoryConfig
 * Author:   sunny
 * Date:     2019/3/5 14:21
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
 * @create 2019/3/5
 * @since 1.0.0
 */
@Configuration
public class MyFilterFactoryConfig {

    @Bean
    public RequestTimeGatewayFilterFactory myRequestTimeGatewayFilterFactory(){
        return new RequestTimeGatewayFilterFactory();
    }

}
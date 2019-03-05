/**
 * FileName: MyFilterConfig
 * Author:   sunny
 * Date:     2019/3/5 14:28
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.springcloudservicegatewayfilter.config;

import com.sunny.springcloud.springcloudservicegatewayfilter.filter.TokenGlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description
 * @author sunny
 * @create 2019/3/5
 * @since 1.0.0
 */
@Configuration
public class MyFilterConfig {

    @Bean
    public TokenGlobalFilter myTokenGlobalFilter(){
        return new TokenGlobalFilter();
    }

}
/**
 * FileName: SentinelAspectConfiguration Author:   sunnyday Date:     2019/7/21 23:35 Description:
 * Sentinel切面配置 History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.servicesentinel.config;

import com.alibaba.csp.sentinel.annotation.aspectj.SentinelResourceAspect;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Sentinel切面配置〉
 *
 * @author sunnyday
 * @create 2019/7/21
 * @since 1.0.0
 */
@Configuration
public class SentinelAspectConfiguration {

    @Bean
    public SentinelResourceAspect sentinelResourceAspect(){
        return new SentinelResourceAspect();
    }
}

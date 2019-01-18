/**
 * FileName: GatewayController
 * Author:   sunny
 * Date:     2019/1/18 14:54
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.springcloudservicegateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @description
 * @author sunny
 * @create 2019/1/18
 * @since 1.0.0
 */
@RestController
public class GatewayController {


    @RequestMapping(value="/fallback")
    public Mono<String> fallback(){
        return Mono.just("fallback");
    }
}
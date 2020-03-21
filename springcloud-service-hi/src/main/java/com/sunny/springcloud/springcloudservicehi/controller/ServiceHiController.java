/**
 * FileName: ServiceHiController
 * Author:   sunny
 * Date:     2018/10/29 17:06
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.springcloudservicehi.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @author sunny
 * @create 2018/10/29
 * @since 1.0.0
 */
@RestController
@RequestMapping(value = "/springcloud")
public class ServiceHiController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/hi/{name}")
    @HystrixCommand(fallbackMethod = "home_fallback")
    public String home(@PathVariable(value="name")String name){
        return "hi " + name + " ,i am from port:" + serverPort;
    }

    /* *
     * @Author sunny
     * @Description  容错方法
     * @Date 2:40 2020/3/22
     * @Param [name]
     * @return java.lang.String
     **/
    public String home_fallback(@PathVariable(value="name")String name){
        return "hi " + name + " ,服务异常,发生熔断,请稍后重试!";
    }

}
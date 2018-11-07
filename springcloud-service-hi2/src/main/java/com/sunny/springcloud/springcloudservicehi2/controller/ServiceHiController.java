/**
 * FileName: ServiceHiController
 * Author:   sunny
 * Date:     2018/10/29 18:11
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.springcloudservicehi2.controller;

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
    public String home(@PathVariable(value="name")String name){
        return "hi " + name + " ,i am from port:" + serverPort;
    }
}
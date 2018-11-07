/**
 * FileName: ServiceRibbonController
 * Author:   sunny
 * Date:     2018/10/29 17:42
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.springcloudserviceribbon.controller;

import com.sunny.springcloud.springcloudserviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(value="/springcloud")
public class ServiceRibbonController {

    @Autowired
    private HelloService helloService;


    @GetMapping(value="/hi/{name}")
    public String hi(@PathVariable(value="name")String name){
       return helloService.hiService(name);
    }
}
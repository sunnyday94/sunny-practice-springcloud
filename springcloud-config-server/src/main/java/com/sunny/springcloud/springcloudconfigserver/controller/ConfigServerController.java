/**
 * FileName: ConfigServerController
 * Author:   sunny
 * Date:     2018/12/10 14:55
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.springcloudconfigserver.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @author sunny
 * @create 2018/12/10
 * @since 1.0.0
 */
@RequestMapping(value="/springcloud")
@RestController
public class ConfigServerController {

    @Value("${foo}")
    private String foo;

    @RequestMapping(method=RequestMethod.GET,value = "hi")
    public String hi(){
        return foo;
    }
}
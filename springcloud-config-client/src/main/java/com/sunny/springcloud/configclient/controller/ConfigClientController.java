/**
 * FileName: ConfigClientController
 * Author:   sunny
 * Date:     2018/12/10 17:32
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @author sunny
 * @create 2018/12/10
 * @since 1.0.0
 */
@RequestMapping(value="/springcloud")
@RestController
public class ConfigClientController {

    @Value("${fruit}")
    private String fruit;

    /**
     * 获取配置文件信息
     * @return
     */
    @GetMapping(value="hi")
    public String hi(){
        return fruit;
    }
}
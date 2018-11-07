/**
 * FileName: HiService
 * Author:   sunny
 * Date:     2018/10/29 17:49
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.springcloudserviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @description
 * @author sunny
 * @create 2018/10/29
 * @since 1.0.0
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;


    public String hiService(String name){
        return restTemplate.getForObject("http://service-hi/springcloud/hi/".concat(name), String.class);
    }
}
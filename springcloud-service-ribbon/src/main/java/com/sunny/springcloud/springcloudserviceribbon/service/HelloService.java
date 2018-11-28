/**
 * FileName: HiService
 * Author:   sunny
 * Date:     2018/10/29 17:49
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.springcloudserviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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


    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name){
        return restTemplate.getForObject("http://service-hi/springcloud/hi/".concat(name), String.class);
    }

    /***
     * fallback
     * @param name
     * @return
     */
    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }
}
/**
 * FileName: SentinelController Author:   sunnyday Date:     2019/7/21 19:05 Description:
 * SentinelController History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.servicesentinel.controller;

import com.sunny.springcloud.servicesentinel.service.TestService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 〈一句话功能简述〉<br> 
 * 〈SentinelController〉
 *
 * @author sunnyday
 * @create 2019/7/21
 * @since 1.0.0
 */
@RestController
public class SentinelController {

    @Resource
    private TestService testService;

    @GetMapping("/foo")
    public String apiFoo() throws Exception {
        return testService.test();
    }

}

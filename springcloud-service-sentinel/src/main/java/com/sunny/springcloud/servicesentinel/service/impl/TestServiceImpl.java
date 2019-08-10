/**
 * FileName: TestServiceImpl Author:   sunnyday Date:     2019/7/21 22:45 Description:
 * TestServiceImpl History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.servicesentinel.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.sunny.springcloud.servicesentinel.block.TestServiceBlockHandler;
import com.sunny.springcloud.servicesentinel.service.TestService;

import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈TestServiceImpl〉
 *
 * @author sunnyday
 * @create 2019/7/21
 * @since 1.0.0
 */
@Service
public class TestServiceImpl implements TestService {

    @Override
    @SentinelResource(value = "test",blockHandler = "testBlockHandler",
            blockHandlerClass = TestServiceBlockHandler.class)
    public String test() {
        System.out.println("Hello Sentinel!");
        return "Hello Sentinel!";
    }

}

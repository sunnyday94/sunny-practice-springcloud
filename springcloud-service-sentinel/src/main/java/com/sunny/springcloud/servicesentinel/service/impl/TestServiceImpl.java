/**
 * FileName: TestServiceImpl Author:   sunnyday Date:     2019/7/21 22:45 Description:
 * TestServiceImpl History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.servicesentinel.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.sunny.springcloud.servicesentinel.block.TestServiceBlockHandler;
import com.sunny.springcloud.servicesentinel.fallback.TestServiceFallback;
import com.sunny.springcloud.servicesentinel.service.TestService;

/**
 * 〈一句话功能简述〉<br> 
 * 〈TestServiceImpl〉
 *
 * @author sunnyday
 * @create 2019/7/21
 * @since 1.0.0
 */
public class TestServiceImpl implements TestService {

    @Override
    @SentinelResource(value = "test",blockHandler = "testBlockHandler",
            blockHandlerClass = TestServiceBlockHandler.class)
    public void test() {
        System.out.println("Test");
    }


    @Override
    @SentinelResource(value="hello",fallback = "helloFallback",
            fallbackClass = TestServiceFallback.class)
    public String hello(Long t) {
        if (t < 0) {
            throw new IllegalArgumentException("invalid arg");
        }
        return String.format("Hello at %d", t);
    }
}

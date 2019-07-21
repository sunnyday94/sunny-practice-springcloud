/**
 * FileName: TestServiceFallback Author:   sunnyday Date:     2019/7/21 22:41 Description:
 * TestService熔断回退 History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.servicesentinel.fallback;

/**
 * 〈一句话功能简述〉<br> 
 * 〈TestServiceFallback〉
 *
 * @author sunnyday
 * @create 2019/7/21
 * @since 1.0.0
 */
public class TestServiceFallback {


    public static String helloFallback(long s, Throwable ex) {
        ex.printStackTrace();
        return "error,helloFallback " + s;
    }
}

/**
 * FileName: TestServiceBlockHandler Author:   sunnyday Date:     2019/7/21 22:42 Description:
 * TestServiceBlockHandler History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.servicesentinel.block;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * 〈一句话功能简述〉<br> 
 * 〈TestServiceBlockHandler〉
 *
 * @author sunnyday
 * @create 2019/7/21
 * @since 1.0.0
 */
public class TestServiceBlockHandler {

    public static String testBlockHandler(BlockException e){
        // Handler method that handles BlockException when blocked.
        // The method parameter list should match original method, with the last additional
        // parameter with type BlockException. The return type should be same as the original method.
        // The block handler method should be located in the same class with original method by default.
        // If you want to use method in other classes, you can set the blockHandlerClass
        // with corresponding Class (Note the method in other classes must be static).
        if(e!=null){
            System.err.println("test接口限流了"+e.getClass().getCanonicalName());
        }
        return "Hello Sentinel,test接口限流了!";
    }
}

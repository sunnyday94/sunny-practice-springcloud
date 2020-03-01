/**
 * FileName: MySelfRule Author:   sunny Date:     2020/3/1 21:57 Description: Ribbon自定义负载均衡配置类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Ribbon自定义负载均衡配置类〉
 *  注意:官方文档明确说明，该配置类不能放在@ComponentScan扫描的包及子包下，
 *  否则自定义配置不生效
 * @author sunny
 * @create 2020/3/1
 * @since 1.0.0
 */
@Configuration
public class MySelfRule {


    /* *
     * @Author sunny
     * @Description  负载均衡默认是轮询，这里手动指定为随机
     * @Date 21:58 2020/3/1
     * @Param []
     * @return com.netflix.loadbalancer.IRule
     **/
    @Bean
    public IRule myRule(){
        return new RandomRule();
    }

}

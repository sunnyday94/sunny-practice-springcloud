/**
 * FileName: RequestTimeFilterFactory
 * Author:   sunny
 * Date:     2019/3/4 15:35
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.springcloudservicegatewayfilter.filter.factory;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import reactor.core.publisher.Mono;

import java.util.Collections;
import java.util.List;

/**
 * @description 自定义Gateway过滤器工厂
 * @author sunny
 * @create 2019/3/4
 * @since 1.0.0
 */
@Slf4j
public class RequestTimeGatewayFilterFactory extends AbstractGatewayFilterFactory<RequestTimeGatewayFilterFactory.Config> {

    private static final String REQUEST_TIME_BEGIN = "requestTimeBegin";
    private static final String KEY = "isPrintParams";

    public RequestTimeGatewayFilterFactory(){

        //调用下父类的构造器把Config类型传过去
        super(Config.class);
    }

    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {
            exchange.getAttributes().put(REQUEST_TIME_BEGIN, System.currentTimeMillis());
            return chain.filter(exchange).then(
                    Mono.fromRunnable(()->{
                        Long startTime = exchange.getAttribute(REQUEST_TIME_BEGIN);
                        config.setIsPrintParams(true);
                        if(startTime!=null){
                            StringBuilder sb = new StringBuilder(
                                    String.format("请求原路径:%s,总耗时:%s ms",exchange.getRequest().getURI().getRawPath(),
                                            System.currentTimeMillis()-startTime)
                            );
                            if(config.getIsPrintParams()){
                                sb.append(  String.format("  请求参数是:%s",exchange.getRequest().getQueryParams()));
                            }
                            log.info(sb.toString());
                        }
                    })
            );
        };
    }

    @Override
    public List<String> shortcutFieldOrder() {
        return Collections.singletonList(KEY);
    }


    @Getter
    @Setter
    public static class Config{
        /**
         * 是否打印参数
         */
        private Boolean isPrintParams;
    }
}
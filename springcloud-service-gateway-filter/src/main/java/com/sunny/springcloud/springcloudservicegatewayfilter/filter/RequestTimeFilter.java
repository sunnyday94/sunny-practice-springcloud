/**
 * FileName: RequestTimeFilter
 * Author:   sunny
 * Date:     2019/3/4 10:41
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.springcloudservicegatewayfilter.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @description
 * @author sunny
 * @create 2019/3/4
 * @since 1.0.0
 */
@Slf4j
public class RequestTimeFilter implements GatewayFilter, Ordered {

    private static final String REQUEST_TIME_BEGIN = "requestTimeBegin";

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        exchange.getAttributes().put(REQUEST_TIME_BEGIN, System.currentTimeMillis());
        return chain.filter(exchange).then(
            Mono.fromRunnable(()->{
                Long startTime = exchange.getAttribute(REQUEST_TIME_BEGIN);
                if(startTime!=null)
                    log.info(String.format("请求原路径:%s,总耗时:%s ms",exchange.getRequest().getURI().getRawPath(),
                            System.currentTimeMillis()-startTime));
            })
        );
    }


    /**
     * 给过滤器设定优先级别的，值越大则优先级越低
     * @return
     */
    @Override
    public int getOrder() {
        return 0;
    }
}
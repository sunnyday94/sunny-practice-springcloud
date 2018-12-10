/**
 * FileName: MyZuulFilter
 * Author:   sunny
 * Date:     2018/12/9 19:00
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.springcloudservicezuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 〈一句话功能简述〉
 * @author sunny
 * @create 2018/12/9
 * @since 1.0.0
 */
@Configuration
public class MyZuulFilter extends ZuulFilter {

    /**
     * @Description:
     * filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下：
     * pre：路由之前
     * routing：路由之时
     * post： 路由之后
     * error：发送错误调用
      * @Author: sunny
      * @Date: 19:03 2018/12/9
      */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
      * @Description: 过滤的顺序
      * @Author: sunny
      * @Date: 19:04 2018/12/9
      */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
      * @Description: 这里可以写逻辑判断，是否要过滤，这里为true,永远过滤。
      * @Author: sunny
      * @Date: 19:04 2018/12/9
      */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
      * @Description: 过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问
      * @Author: sunny
      * @Date: 19:05 2018/12/9
      */
    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        Object token = request.getParameter("token");
        if(token==null){
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401); //缺少认证
            try {
                context.getResponse().getWriter().write("token is empty");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        return "pass";
    }
}
/**
 * FileName: ScheduleHiService
 * Author:   sunny
 * Date:     2018/10/29 18:25
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.springcloudservicefeign.service;

import com.sunny.springcloud.springcloudservicefeign.service.impl.ScheduleHiServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description
 * @author sunny
 * @create 2018/10/29
 * @since 1.0.0
 */
@FeignClient(value="service-hi",fallback = ScheduleHiServiceHystrix.class)
public interface ScheduleHiService {

    /**
     * @Description: 调用service-hi的home方法
     * @Author: sunny
     * @Date: 2018/10/29 18:26
     */
    @GetMapping(value="/springcloud/hi/{name}")
    String getHi(@PathVariable("name")String name);
}
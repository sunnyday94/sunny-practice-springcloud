/**
 * FileName: ScheduleHiServiceHystrix
 * Author:   sunny
 * Date:     2018/11/28 13:31
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.springcloudservicefeign.service.impl;

import com.sunny.springcloud.springcloudservicefeign.service.ScheduleHiService;
import org.springframework.stereotype.Component;

/**
 * @description
 * @author sunny
 * @create 2018/11/28
 * @since 1.0.0
 */
@Component
public class ScheduleHiServiceHystrix implements ScheduleHiService {

    @Override
    public String getHi(String name) {
        return "hi,"+name+",sorry error!";
    }
}
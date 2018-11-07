/**
 * FileName: ServiceFeignController
 * Author:   sunny
 * Date:     2018/10/29 18:24
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.sunny.springcloud.springcloudservicefeign.controller;

import com.sunny.springcloud.springcloudservicefeign.service.ScheduleHiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description
 * @author sunny
 * @create 2018/10/29
 * @since 1.0.0
 */
@RestController
@RequestMapping(value="/springcloud")
public class ServiceFeignController {

    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    private ScheduleHiService scheduleHiService;

    @GetMapping(value="/hi/{name}")
    public String getHi(@PathVariable(value="name")String name){
        return scheduleHiService.getHi(name);
    }

}
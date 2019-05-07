package com.zhan.hellodubboserviceconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zhan.hello.dubbo.service.user.api.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    //远程接口透明调用,d调用版本号为1.0.0的版本
    @Reference(version = "${user.service.version}")
    private UserService userService;

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(){
        String s = userService.sayHi();
        return s;
    }
}

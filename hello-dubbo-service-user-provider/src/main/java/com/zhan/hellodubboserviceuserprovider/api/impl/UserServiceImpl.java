package com.zhan.hellodubboserviceuserprovider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhan.hello.dubbo.service.user.api.UserService;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "${user.service.version}")
public class UserServiceImpl implements UserService {
    @Value("${dubbo.protocol.port}")
    private String port;

    @Override
    public String sayHi() {
        return "Hello Dubbo,i am from port:"+port;
    }
}

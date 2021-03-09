package org.sxyxhj.dubboconsumer.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sxyxhj.dubboapi.HelloService;

/**
 * @program: rpc-demo
 * @description: hello controller
 * @author: @sxyxhj
 * @create: 2021-03-09 22:41
 **/
@RestController
public class HelloController {

    @DubboReference
    HelloService service;

    @GetMapping("/hello")
    public String hello(){
        return service.hellow("Dubbo");
    }

}

    

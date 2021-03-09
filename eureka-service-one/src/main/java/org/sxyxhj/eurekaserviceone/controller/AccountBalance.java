package org.sxyxhj.eurekaserviceone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: rpc-demo
 * @description: 账户余额服务
 * @author: @sxyxhj
 * @create: 2021-03-06 12:25
 **/
@RestController
public class AccountBalance {
    @GetMapping("/getBalance")
    public String getBalance(){
        return "100";
    }
}

    

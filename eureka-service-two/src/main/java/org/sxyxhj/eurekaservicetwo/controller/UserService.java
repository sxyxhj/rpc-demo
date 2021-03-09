package org.sxyxhj.eurekaservicetwo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.sxyxhj.eurekaservicetwo.client.AccountBalance;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: rpc-demo
 * @description: 用户服务
 * @author: @sxyxhj
 * @create: 2021-03-06 12:18
 **/
@RestController
public class UserService {
    @Autowired
    AccountBalance balance;

    @GetMapping("/getUser")
    public Map getUser(){
        Map map = new HashMap();

        map.put("username","jack");
        map.put("balance",balance.getBalance());

        return map;
    }
}

    

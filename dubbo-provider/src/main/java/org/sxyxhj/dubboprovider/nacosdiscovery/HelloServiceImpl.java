package org.sxyxhj.dubboprovider.nacosdiscovery;

import org.apache.dubbo.config.annotation.DubboService;
import org.sxyxhj.dubboapi.HelloService;

/**
 * @program: rpc-demo
 * @description: 测试demo
 * @author: @sxyxhj
 * @create: 2021-03-09 22:37
 **/
@DubboService
public class HelloServiceImpl implements HelloService {
    @Override
    public String hellow(String name) {
        return "hello "+name+"!!";
    }
}

    

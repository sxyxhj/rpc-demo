package org.sxyxhj.eurekaservicetwo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "eureka-service1")
public interface AccountBalance {
    @GetMapping("/getBalance")
    public String getBalance();
}

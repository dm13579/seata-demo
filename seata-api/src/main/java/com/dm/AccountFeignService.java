package com.dm;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "seata-account-service",path = "/account")
@ResponseBody
public interface AccountFeignService {

    @RequestMapping(value = "/pay", method = RequestMethod.GET)
    void pay(@RequestParam("id") Long id);
}

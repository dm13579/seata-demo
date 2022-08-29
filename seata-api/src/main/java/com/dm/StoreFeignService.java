package com.dm;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "seata-store-service",path = "/store")
@ResponseBody
public interface StoreFeignService {

    @RequestMapping(value = "/minus", method = RequestMethod.GET)
    void minus(@RequestParam("id") Long id,
               @RequestParam("count") Integer count);
}

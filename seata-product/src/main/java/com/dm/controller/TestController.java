package com.dm.controller;

import com.dm.AccountFeignService;
import com.dm.StoreFeignService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
@RequestMapping("/test")
@Slf4j
@RequiredArgsConstructor
public class TestController {

    private final AccountFeignService accountFeignService;
    private final StoreFeignService storeFeignService;

    @GetMapping("/test")
    public void test() {
        System.out.println("测试");
        accountFeignService.pay(1L);
        storeFeignService.minus(1L, 1);
    }
}

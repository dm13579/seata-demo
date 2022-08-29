package com.dm.controller;

import com.dm.AccountFeignService;
import com.dm.mapper.SeataAccountMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountFeignServiceImpl implements AccountFeignService {

    private final SeataAccountMapper seataAccountMapper;

    @Override
    public void pay(Long id) {
        System.out.println(seataAccountMapper.selectById(1));
    }
}

package com.dm.controller;

import com.dm.StoreFeignService;
import com.dm.mapper.SeataStoreMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
@RequestMapping("/store")
@RequiredArgsConstructor
public class StoreFeignServiceImpl implements StoreFeignService {

    private final SeataStoreMapper seataStoreMapper;

    @Override
    public void minus(Long id, Integer count) {
        System.out.println(seataStoreMapper.selectById(1));
    }
}

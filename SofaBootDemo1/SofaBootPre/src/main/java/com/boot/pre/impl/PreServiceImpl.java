package com.boot.pre.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.example.sofabootfacade.service.PreService;
import org.springframework.stereotype.Component;

@Component
@SofaService(uniqueId = "preService")
public class PreServiceImpl implements PreService {

    @Override
    public void pre() {
        System.out.println("初始化前置");
    }
}

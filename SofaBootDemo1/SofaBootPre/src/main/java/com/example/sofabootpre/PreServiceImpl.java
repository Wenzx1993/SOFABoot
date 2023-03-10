package com.example.sofabootpre;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.example.sofabootfacade.service.PreService;
import org.springframework.stereotype.Component;

/**
 * 此服务所在模块应该先执行
 * 1.配置sofa-moudle.properties中当前自己的模块名称
 */
@Component
@SofaService
public class PreServiceImpl implements PreService {

    @Override
    public void pre() {
        System.out.println("初始化前置");
    }
}

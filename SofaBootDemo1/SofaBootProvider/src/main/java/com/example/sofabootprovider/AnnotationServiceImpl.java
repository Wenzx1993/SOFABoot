package com.example.sofabootprovider;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.example.sofabootfacade.service.HelloWorldService;
import org.springframework.stereotype.Service;

/**
 * 注入的方式发布服务
 */
@Service
@SofaService(uniqueId = "annotationService")
public class AnnotationServiceImpl implements HelloWorldService {

    @Override
    public String hello() {
        return "你好，annotation sofa";
    }

}

package com.example.sofabootconsumer.service.impl;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.example.sofabootconsumer.service.TestSofaService;
import com.example.sofabootfacade.service.HelloWorldService;
import org.springframework.stereotype.Service;

@Service
public class TestSofaServiceImpl implements TestSofaService {

    @SofaReference
    private HelloWorldService service;

    @SofaReference(uniqueId = "annotationService")
    private HelloWorldService annotationService;

    @SofaReference(uniqueId = "apiService")
    private HelloWorldService apiService;

    public String hiXml() {
        return service.hello();
    }

    public String hiAnno() {
        return annotationService.hello();
    }

    public String hiApi() {
        return apiService.hello();
    }

}

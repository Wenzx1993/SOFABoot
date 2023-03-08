package com.example.sofabootconsumer.service.impl;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.example.sofabootconsumer.service.TestSofaService;
import com.example.sofabootfacade.service.HelloWorldService;
import com.example.sofabootfacade.service.PreService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class TestSofaServiceImpl implements TestSofaService {

    @SofaReference
    private HelloWorldService service;

    @SofaReference(uniqueId = "annotationService")
    private HelloWorldService annotationService;

    @SofaReference(uniqueId = "apiService")
    private HelloWorldService apiService;

    @SofaReference(uniqueId = "preService")
    private PreService preService;

    /*设置要求模块*/
    @PostConstruct
    public void pre(){
        preService.pre();
    }

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

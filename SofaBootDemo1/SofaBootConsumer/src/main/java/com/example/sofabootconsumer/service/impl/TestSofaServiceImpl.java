package com.example.sofabootconsumer.service.impl;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.example.sofabootconsumer.service.TestSofaService;
import com.example.sofabootfacade.service.HelloWorldService;
import com.example.sofabootfacade.service.PreService;

/**
 * @Service可以和xmL配置bean一起使用
 *
 * 这里bean的加载时机有问题
 *
 * init-method方式要求模块先于xxx执行，Require-Module，只能这样搭配
 */
public class TestSofaServiceImpl implements TestSofaService {

    @SofaReference
    private HelloWorldService service;

    @SofaReference(uniqueId = "annotationService")
    private HelloWorldService annotationService;

    @SofaReference(uniqueId = "apiService")
    private HelloWorldService apiService;

    @SofaReference
    private PreService preService;

    /*设置要求模块*/
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

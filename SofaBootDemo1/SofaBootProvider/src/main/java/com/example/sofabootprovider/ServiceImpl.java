package com.example.sofabootprovider;

import com.example.sofabootfacade.service.HelloWorldService;

/**
 * 注入的方式发布服务
 */
public class ServiceImpl implements HelloWorldService {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String hello() {
        return "你好，" + type + " sofa";
    }


}

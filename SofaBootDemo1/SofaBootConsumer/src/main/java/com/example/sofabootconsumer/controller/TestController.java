package com.example.sofabootconsumer.controller;

import com.example.sofabootconsumer.service.TestSofaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestSofaService testSofaService;

    @GetMapping("hiXml")
    public String hiXml() {
        return testSofaService.hiXml();
    }

    @GetMapping("hiAnno")
    public String hiAnno() {
        return testSofaService.hiAnno();
    }

    @GetMapping("hiApi")
    public String hiApi() {
        return testSofaService.hiApi();
    }
}

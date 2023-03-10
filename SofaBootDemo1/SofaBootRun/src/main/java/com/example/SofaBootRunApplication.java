package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 注意：
 * @ImportResource 加载的xml可以是多个，如果配置路径通配符，则也只加载一个匹配的xml，要加载多个路径，则需配置多个
 *
 * spring默认加载 META-INF/spring下的所有xml
 */
@SpringBootApplication
public class SofaBootRunApplication {

    public static void main(String[] args) {
        SpringApplication.run(SofaBootRunApplication.class, args);
    }

}

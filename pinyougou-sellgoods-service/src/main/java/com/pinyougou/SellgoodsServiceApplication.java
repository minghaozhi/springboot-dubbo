package com.pinyougou;

import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @program: pinyougou-parent
 * @description: ${description}
 * @author: moshang
 * @create: 2019-02-25 14:54
 **/
@SpringBootApplication
@EnableDubboConfig
public class SellgoodsServiceApplication {
    public static void main(String[] args) {
        //设置不是web模块
    new SpringApplicationBuilder(SellgoodsServiceApplication.class)
            .web(WebApplicationType.NONE).run(args);
    }
}

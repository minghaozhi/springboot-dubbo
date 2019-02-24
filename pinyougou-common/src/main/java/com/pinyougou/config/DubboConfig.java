package com.pinyougou.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.AnnotationBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DubboConfig {
    public static final String APPLICATION_NAME="provider-hello";
    public static final String REGISTRY_ADDRESS="zookeeper://47.98.132.138:2181";
    public static final String ANNOTATION_PACKAGE="com.example.provider";

    @Bean
    @ConfigurationProperties(prefix="dubbo.application")
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        return applicationConfig;
    }

    @Bean
    @ConfigurationProperties(prefix="dubbo.registry")
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        return registryConfig;
    }

    @Bean
    @ConfigurationProperties(prefix="dubbo.annotation")
    public AnnotationBean annotationBean() {
        AnnotationBean annotationBean = new AnnotationBean();
        return annotationBean;
    }

    @Bean
    @ConfigurationProperties(prefix="dubbo.protocol")
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        return protocolConfig;
    }

}

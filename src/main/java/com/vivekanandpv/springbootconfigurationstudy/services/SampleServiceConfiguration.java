package com.vivekanandpv.springbootconfigurationstudy.services;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleServiceConfiguration {
    //  The Foo and Bar implementations are not components now
    //  We use this configuration to provide one vs other depending
    //  on the property

    //  ConditionalOnProperty is available only in Spring Boot
    //  Also, you can experiment with matchIfMissing
    @Bean
    @ConditionalOnProperty(name = "app.foo", havingValue = "true")
    public SampleService getFooImplementation() {
        return new SampleServiceFooImplementation();
    }

    @Bean
    @ConditionalOnProperty(name = "app.bar", havingValue = "true")
    public SampleService getBarImplementation() {
        return new SampleServiceBarImplementation();
    }
}

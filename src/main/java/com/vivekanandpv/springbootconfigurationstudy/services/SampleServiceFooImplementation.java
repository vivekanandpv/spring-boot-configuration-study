package com.vivekanandpv.springbootconfigurationstudy.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//  In many ways, @Profile is a relic from pre Spring Boot times
//  Spring Core Framework doesn't have environment specific config files

//  Because of complex expressions buried deep within the code
//  @Profile quickly becomes unwieldy and unreasonable
//  When multiple profiles are combined, it becomes hard to predict the outcome
//  environment specific profiles can de justified though
//  But consider the separate application-<env>.properties

@Service
//  foo or baz or (qux and quux) or not bar
@Profile({"foo", "baz", "qux & quux", "!bar"})
public class SampleServiceFooImplementation implements SampleService {
    @Override
    public String getMessage() {
        return "SampleService:foo";
    }
}

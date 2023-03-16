package com.vivekanandpv.springbootconfigurationstudy.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("foo")
public class SampleServiceFooImplementation implements SampleService {
    @Override
    public String getMessage() {
        return "SampleService:foo";
    }
}

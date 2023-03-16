package com.vivekanandpv.springbootconfigurationstudy.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//  This component belongs to the default profile
@Service
//  When multiple components for the same type are declared for different profiles
//  provide the fallback as default. This is required when profiled beans are used.
@Profile("default")
public class SampleServiceDefaultImplementation implements SampleService {
    @Override
    public String getMessage() {
        return "SampleService:default";
    }
}

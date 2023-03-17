package com.vivekanandpv.springbootconfigurationstudy.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

public class SampleServiceBarImplementation implements SampleService {
    @Override
    public String getMessage() {
        return "SampleService:bar";
    }
}

package com.vivekanandpv.springbootconfigurationstudy.services;

import org.springframework.stereotype.Service;

@Service
public class SampleServiceImplementation implements SampleService {
    @Override
    public String getMessage() {
        return "Static message";
    }
}

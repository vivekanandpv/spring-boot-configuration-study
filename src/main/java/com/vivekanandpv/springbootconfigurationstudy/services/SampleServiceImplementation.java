package com.vivekanandpv.springbootconfigurationstudy.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImplementation implements SampleService {
    @Value("${app.message}")
    private String message;

    @Override
    public String getMessage() {
        return message;
    }
}

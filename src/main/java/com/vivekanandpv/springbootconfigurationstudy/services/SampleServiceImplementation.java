package com.vivekanandpv.springbootconfigurationstudy.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImplementation implements SampleService {
    private final String message;

    public SampleServiceImplementation(@Value("${app.message}") String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

package com.vivekanandpv.springbootconfigurationstudy.services;

import com.vivekanandpv.springbootconfigurationstudy.ancillary.ApplicationProperties;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImplementation implements SampleService {
    private final ApplicationProperties applicationProperties;

    public SampleServiceImplementation(ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
    }

    @Override
    public String getMessage() {
        return String.format(
                "Url: %s; Username: %s; Password: %s; Retry: %d",
                applicationProperties.getDatabaseUrl(),
                applicationProperties.getDatabaseUsername(),
                applicationProperties.getDatabasePassword(),
                applicationProperties.getRetryDuration()
        );
    }
}

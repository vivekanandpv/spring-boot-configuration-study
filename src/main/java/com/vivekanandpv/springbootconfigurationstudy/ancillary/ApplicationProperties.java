package com.vivekanandpv.springbootconfigurationstudy.ancillary;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationProperties {
    //  Avoid using @Value at the field level
    //  Component classes should be transparent

    //  We need only getters; hence the fields are final
    private final String databaseUrl;
    private final String databaseUsername;
    private final String databasePassword;
    private final int retryDuration;

    //  Use: DATABASE_URL=jdbc:oracle:thin:@localhost:1521:XE;DATABASE_USERNAME=C##SAMPLE;DATABASE_PASSWORD=oracle;DATABASE_RETRY=30
    public ApplicationProperties(
            @Value("${DATABASE_URL}") String databaseUrl,
            @Value("${DATABASE_USERNAME}") String databaseUsername,
            @Value("${DATABASE_PASSWORD}") String databasePassword,
            @Value("${DATABASE_RETRY}") int retryDuration
    ) {
        this.databaseUrl = databaseUrl;
        this.databaseUsername = databaseUsername;
        this.databasePassword = databasePassword;
        this.retryDuration = retryDuration;
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getDatabaseUsername() {
        return databaseUsername;
    }

    public String getDatabasePassword() {
        return databasePassword;
    }

    public int getRetryDuration() {
        return retryDuration;
    }
}

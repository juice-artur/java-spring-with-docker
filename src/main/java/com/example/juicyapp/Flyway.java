package com.example.juicyapp;

import org.flywaydb.core.Flyway;
import org.springframework.boot.autoconfigure.flyway.FlywayProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({FlywayProperties.class })
class DatabaseConfig {
    @Bean(initMethod = "migrate")
    public Flyway flyway(FlywayProperties flywayProperties) {
      return Flyway.configure()
        .dataSource(
            "jdbc:postgresql://localhost:15432/test",
            "username",
            "password"
        )
        .locations(flywayProperties.getLocations()
          .stream()
          .toArray(String[]::new))
        .baselineOnMigrate(true)
        .load();
    }
}
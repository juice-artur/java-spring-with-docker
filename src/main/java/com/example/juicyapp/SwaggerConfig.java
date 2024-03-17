package com.example.juicyapp;

import org.springdoc.core.models.GroupedOpenApi;
import org.springdoc.core.properties.SwaggerUiConfigParameters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi customOpenAPI(SwaggerUiConfigParameters swaggerUiConfigParameters) {
        return GroupedOpenApi.builder()
                .group("api")
                .pathsToMatch("/**")
                .build();
    }

    @Bean
    public GroupedOpenApi controllerApi() {
        return GroupedOpenApi.builder()
                .group("controller-api")
                .packagesToScan("com.example.juicyapp") // Specify the package to scan
                .build();
    }

}
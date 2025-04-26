package com.viago.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI swaggerCustomConfig() {
        return  new OpenAPI().info(
                new Info().title("ViaGo Application APIs")
                        .description("This is the backend service for ViaGo, a cab booking platform that connects riders with drivers seamlessly. Built with Spring Boot, this RESTful API handles core features like user management, ride requests, and location tracking.")
        );
    }
}

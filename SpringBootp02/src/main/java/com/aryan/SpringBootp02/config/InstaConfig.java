package com.aryan.SpringBootp02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;


@Configuration
public class InstaConfig {

    @Bean
    public LocalDateTime getInstance()
    {
        return LocalDateTime.now();
    }
}

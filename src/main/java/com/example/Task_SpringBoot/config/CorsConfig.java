package com.example.Task_SpringBoot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOriginPattern("http://localhost:4200"); // Autoriser les requêtes provenant de http://localhost:4200
        corsConfiguration.addAllowedMethod("*"); // Autoriser toutes les méthodes (GET, POST, PUT, DELETE, etc.)
        corsConfiguration.addAllowedHeader("*"); // Autoriser tous les en-têtes
        corsConfiguration.setAllowCredentials(true); // Autoriser les cookies

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfiguration);

        return new CorsFilter(source);
    }
}
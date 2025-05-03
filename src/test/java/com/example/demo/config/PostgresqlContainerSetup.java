package com.example.demo.config;

import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

@Configuration
public class PostgresqlContainerSetup {
    private PostgreSQLContainer<?> postgresContainer;
    private JdbcTemplate jdbcTemplate;

    @Bean
    @ServiceConnection
    public PostgreSQLContainer<?> postgresContainer() {
        return new PostgreSQLContainer<>(DockerImageName.parse("postgres:13-alpine"))
                .withDatabaseName("testdb")
                .withUsername("user")
                .withPassword("password");
    }
}

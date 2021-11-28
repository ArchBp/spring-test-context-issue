package com.example.testcontextissue.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SftpTestConfig {

    @Bean
    EmbeddedSftpServer embeddedSftpServer(){
        return new EmbeddedSftpServer();
    }
}

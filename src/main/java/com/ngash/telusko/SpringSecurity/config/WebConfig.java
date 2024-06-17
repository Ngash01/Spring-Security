package com.ngash.telusko.SpringSecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class WebConfig {

    @Bean(name = "PasswordEncoderBean")
    public PasswordEncoder PasswordEncoder(){
        return new BCryptPasswordEncoder(11);
    }
}








package com.example.myfirstspring;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.mybeans.Person;

@Configuration
public class AppConfig {
    @Bean
    @Scope("prototype")
    public String greeting() {
        return "Hello!";
    }

    @Bean
    @Scope("prototype")
    public LocalTime show() {
        return LocalTime.now();
    }

    @Bean
    @Scope("prototype")
    public Person getPerson() {
        return new Person("Roger", 0);
    }
}

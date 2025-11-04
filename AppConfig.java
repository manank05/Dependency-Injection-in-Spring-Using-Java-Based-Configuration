package com.example.springdi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Course courseBean() {
        return new Course("Spring Framework Fundamentals");
    }

    @Bean
    public Student studentBean() {
        // Inject Course bean into Student
        return new Student(courseBean());
    }
}

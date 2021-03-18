
package com.example.HospitalSystem.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "com.example.HospitalSystem")
@PropertySource("application.properties")
@EnableJpaRepositories(basePackages = "com.example.HospitalSystem.GPA")
public class Config {



}

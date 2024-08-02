
package com.example.bootstrapper.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = {"cloud.solvo.worker.models", "cloud.solvo.worker.utils"})
@EnableJpaRepositories(basePackages = "cloud.solvo.worker.models")
public class BootstrapperConfiguration {
    // Additional configuration if needed
}

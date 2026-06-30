package com.cdc.cowmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({
        "com.cdc.cowmanagement",
        "com.sridairy"
})
@EnableJpaRepositories({
        "com.cdc.cowmanagement.repository",
        "com.sridairy.repository"
})
@EntityScan({
        "com.cdc.cowmanagement.model",
        "com.sridairy.model"
})
public class CowManagementBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(
                CowManagementBackendApplication.class,
                args
        );

        System.out.println("Backend Running...");
        System.out.println("http://localhost:8081");
    }
}
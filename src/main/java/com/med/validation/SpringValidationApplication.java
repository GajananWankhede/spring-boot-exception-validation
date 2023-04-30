package com.med.validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class SpringValidationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringValidationApplication.class, args);
    }

}

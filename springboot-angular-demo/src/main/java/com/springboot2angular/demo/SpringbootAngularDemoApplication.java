package com.springboot2angular.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootAngularDemoApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SpringbootAngularDemoApplication.class, args);
    }

    @GetMapping("/api/hello")
    public String hello()
    {
        return "Hello World from Restful API";
    }
}

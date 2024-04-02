package org.example.springdockerizationdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDockerizationDemoApplication {

    @GetMapping("/demo")
    public String message() {
        return "Demo for the docker of the spring application";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringDockerizationDemoApplication.class, args);
    }

}

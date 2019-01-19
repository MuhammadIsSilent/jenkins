package com.example.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsApplication {

    @RequestMapping("")
    public String index() {

        return "Jenkins";
    }

    public static void main(String[] args) {
        SpringApplication.run(JenkinsApplication.class, args);
    }

}


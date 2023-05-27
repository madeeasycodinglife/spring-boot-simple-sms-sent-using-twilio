package com.madeeasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TwilioApplication {

    public static void main(String[] args) {
        new SpringApplication(TwilioApplication.class).run(args);
    }
}

package com.utn.parcial1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApiRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApiRestApplication.class, args);
        System.out.println("Server running on port 8080")
    }

}

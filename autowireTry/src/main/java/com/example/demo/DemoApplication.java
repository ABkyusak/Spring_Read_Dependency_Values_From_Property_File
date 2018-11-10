package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    student std;

    @Autowired
    public DemoApplication(student std) {
        this.std = std;
        System.out.println("abhishek" + std.id);
    }

    public static void main(String[] args) {


        SpringApplication.run(DemoApplication.class, args);


    }
}

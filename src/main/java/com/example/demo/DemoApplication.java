package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoApplication {

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        System.out.println("bean created");

        Student s = context.getBean("student",Student.class);




    }
}




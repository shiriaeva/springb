package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("Юрий");
        person.setSecondName("Рыбников");
        System.out.println(person.getFirstName() + " " + person.getSecondName());
    }

}

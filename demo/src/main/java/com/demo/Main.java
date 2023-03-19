package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//With the lines 9 and 13 we can now run the SpringBoot Application
@SpringBootApplication // << @SpringBootApplication = [@Configuration, @EnableAutoConfiguration, @ComponentScan] all together in one
@RestController // This indicates that the class is a controller, and that all the methods in the marked class will return a JSON response
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet") //Here i create the route and i send the content of the page in the return of the next method
                     // Also to make it work i need to set the @RestController on line 10
    public GreetResponse greet(){
        GreetResponse response = new GreetResponse(
                "Hello",
                List.of("Java", "Golang", "JavaScript"),
                new Person("Alex", 27, 30_000)
        );
        return response;
    }
    record Person(String name, int age, double savings){

    }
    record GreetResponse(
            String greet,
            List<String> favProgrammingLanguages,
            Person person
    ){
    }



}

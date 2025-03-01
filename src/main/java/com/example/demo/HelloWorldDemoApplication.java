package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class HelloWorldDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldDemoApplication.class, args);
    }

//    curl localhost:8080/hello/query?name=Narayan -w "\n"

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {

        return "Hello" + name + "!";
    }
}


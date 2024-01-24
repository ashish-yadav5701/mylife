package com.practicespring.helloworld.controller;

import org.springframework.web.bind.annotation.RestController;

import com.practicespring.helloworld.entity.HElloWorldBean;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/first")
public class HelloWorld {
    @GetMapping("/greet")
    public String greet(){
        return "Welcome to Spring Boot Project";
    }
    @GetMapping("/bean")
    public HElloWorldBean helloWorldBean() {
        return new HElloWorldBean("first message");
    }
    @GetMapping("/customGreet/{name}")
    public HElloWorldBean helloCustom(@PathVariable String name) {
        return new HElloWorldBean("Welcome :: "+name);
    }
    @GetMapping("/sum/{num1}/{num2}")
    public int getSum(@PathVariable int num1, @PathVariable int num2) {
        return  num1+num2;
    }
    
    
    
}

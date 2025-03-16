package com.example.springboot101;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstCLass {
    

    @RequestMapping("/hello")
     public String hello(){
        return "Hello World";
     }

    @RequestMapping("/hello/salmanbashagit ")
    public String helloSlamangit(){
        return "Hello World";
    }



}

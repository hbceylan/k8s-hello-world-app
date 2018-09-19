package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/status")
    public String status(){
        return "Don't worry! I'm OK! Go ahead :)";
    }

    @GetMapping("/get")
    public String jenkins(){
        return "Hello World app is running properly..";
    }
}

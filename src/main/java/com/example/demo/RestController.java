package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.info.BuildProperties;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;





@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Value("${app.version}")
    String version;

    @GetMapping("/status")
    public String status(){
        return "Don't worry! I'm OK! Go ahead :)";
    }

    @GetMapping(value = "/get", produces = MediaType.TEXT_PLAIN_VALUE)
    public String jenkins(){
        return "Hello World app is running properly.. \nThe app version is: " + version + "\n";
    }
}

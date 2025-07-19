package com.example.hellow_wold.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Slf4j
public class HelloWorldController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello(@RequestParam String name){
        log.info("Received request with name: {}:)", name);
        return ResponseEntity.ok("Hello : {"+name+"}, Good to see you! hope you are doing well!!");
    }
}

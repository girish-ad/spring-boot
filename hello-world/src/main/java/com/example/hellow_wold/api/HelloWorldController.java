package com.example.hellow_wold.api;

import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello(@Nullable @RequestParam String name){
        return ResponseEntity.ok("Hello : {"+name+"}");
    }
}

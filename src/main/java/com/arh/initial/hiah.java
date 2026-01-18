package com.arh.initial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class hiah {

    @GetMapping("/")
    public String hi() {
        return "Hi Aaryan welcome.";
    }
    
}

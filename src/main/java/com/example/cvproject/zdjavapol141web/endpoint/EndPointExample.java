package com.example.cvproject.zdjavapol141web.endpoint;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EndPointExample {
    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hello World How Are You";
    }

    @GetMapping("/goodbye")
    public String sayGoodbye() {
        return "Goodbye my Friends";
    }
    @PostMapping(value = "/sayHi")
    public String getHi(){
        return "Hi, Hello, Salut";
    }
}

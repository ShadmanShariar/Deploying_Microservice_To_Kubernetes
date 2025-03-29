package com.example.kubernetes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kubernetes")
public class Controller {

    @GetMapping
    public String hello() {
        return "Hello From Kubernetes!";
    }

}

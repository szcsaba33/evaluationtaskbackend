package com.evalutaiontask.backend.evaluationtaskbackend.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(path = "/hello")
    public String getHello() {
        return "Hi, stranger!";
    }

    @GetMapping(path = "/hello/{subject}")
    public String getTargetedHello(@PathVariable("subject") String subject) {
        return String.format("Hello, %s!", subject);
    }
}

package com.example.jekinsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jenkins")
public class HelloController {
    @GetMapping("/huge")
    public String HelloWorld() throws Exception{
        return "Hello,虎哥";
    }
}

package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class FooController {

    @GetMapping(value = "/getAppName")
    public String getAppName() {
        return "Build_Check";
    }
}
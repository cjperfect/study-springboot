package com.cj.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class indexController {
    @GetMapping("")
    public String index(@RequestParam String name) {
        return "hello => " + name;
    }
}

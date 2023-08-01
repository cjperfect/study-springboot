package com.cj.project.controller;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class indexController {
    @GetMapping("/{name}")
    public String index(@PathVariable("name") String name) {
        return "hello => " + name;
    }
}

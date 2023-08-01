package com.cj.project.controller;

import com.cj.project.model.dto.UserDTO;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/api")
public class indexController {
    @GetMapping("/{name}")
    public String index(@PathVariable("name") String name) {
        return "hello => " + name;
    }

    @PostMapping("/testPost")
    @ResponseBody
    public Map<String, Object> testPost(@RequestBody UserDTO userDTO) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", userDTO.getName());
        map.put("age", userDTO.getAge());
        return map;
    }

}

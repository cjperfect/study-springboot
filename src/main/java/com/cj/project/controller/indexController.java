package com.cj.project.controller;

import com.cj.project.mapper.UserMapper;
import com.cj.project.model.dto.UserDTO;
import com.cj.project.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api")
public class indexController {

    @Autowired
    private UserMapper userMapper;

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


    @GetMapping("/testMybatis")
    @ResponseBody
    public List<User> testMybatis() {
        return userMapper.getAllUser();
    }
}

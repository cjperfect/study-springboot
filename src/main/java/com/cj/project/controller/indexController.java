package com.cj.project.controller;

import com.cj.project.common.response.BaseResponse;
import com.cj.project.mapper.UserMapper;
import com.cj.project.model.dto.UserDTO;
import com.cj.project.model.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
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
    public BaseResponse<String> index(@PathVariable("name") String name) {
//        return BaseResponse.success("hello =>" + name);

        throw new RuntimeException("运行时自定义异常");
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

    @GetMapping("/getUserById")
    @ResponseBody
    public User getUserById(@RequestParam("id") Long id) {
        return userMapper.getUserById(id);
    }

    @PostMapping("/addUser")
    @ResponseBody
    public Integer addUser(@RequestBody @Validated UserDTO userDTO, BindingResult bindingResult) {
        List<FieldError> fieldErrors = bindingResult.getFieldErrors();
        if (!fieldErrors.isEmpty()) {
            throw new RuntimeException(fieldErrors.get(0).getDefaultMessage());
        }

        User user = new User();
        user.setName(userDTO.getName());
        user.setAge(userDTO.getAge());

        return userMapper.addUser(user);
    }

    @PostMapping("/updateUser")
    @ResponseBody
    public Integer updateUser(@RequestBody UserDTO userDTO) {

        User user = new User();
        user.setId(userDTO.getId());
        user.setName(userDTO.getName());
        user.setAge(userDTO.getAge());

        return userMapper.updateUser(user);
    }


    @DeleteMapping("/deleteUser/{id}")
    public Integer deleteUser(@PathVariable("id") Long id) {
        return userMapper.deleteUser(id);
    }


}

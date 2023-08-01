package com.cj.project.model.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
public class UserDTO implements Serializable {

    private Long id;

    @NotEmpty(message = "用户名不能为空")
    private String Name;

    private Integer age;
}

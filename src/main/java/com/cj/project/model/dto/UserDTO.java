package com.cj.project.model.dto;

public class UserDTO {
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private String Name;

    private Integer age;
}

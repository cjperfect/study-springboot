package com.cj.project.model.vo;

import com.cj.project.model.entity.Post;
import lombok.Data;

import java.util.List;

@Data
public class UserVO {
    private Long id;

    private String name;

    private Integer age;

    private List<Post> posts; // 当前用户所有文章
}

package com.cj.project.model.vo;

import com.cj.project.model.entity.User;
import lombok.Data;

@Data
public class Post {
    private Long id;

    private String title;


    private Long userId; // 用户id

    private User user; // 创建的用户
}

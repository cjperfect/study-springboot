package com.cj.project.mapper;

import com.cj.project.model.vo.Post;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface PostMapper {

    List<Post> getAllPost();
}

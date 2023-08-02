package com.cj.project.mapper;

import com.cj.project.model.entity.Post;
import com.cj.project.model.vo.PostVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public interface PostMapper {

    List<PostVO> getAllPost();

    List<Post> getPostsByUserId(@Param("userId") Long userId); // 获取指定用的文章
}

package com.cj.project.mapper;

import com.cj.project.model.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

// 需要添加这个注解, 这样才能被springboot识别到
@Component
public interface UserMapper {

    //    @Select("select * from users")
    List<User> getAllUser();

    // 根据id获取指定用户
    User getUserById(@Param("id") Long id);

    // 新增一条用户
    Integer addUser(User user);

    // 修改用户
    Integer updateUser(User user);

    // 删除用户
    Integer deleteUser(@Param("id") Long id);
}

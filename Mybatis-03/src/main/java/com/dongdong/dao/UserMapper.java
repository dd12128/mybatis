package com.dongdong.dao;

import com.dongdong.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> getUserList();
    // 方法存在多个参数， 所有的参数前面必须加上 @Param(“id”)注解
    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int id);
}

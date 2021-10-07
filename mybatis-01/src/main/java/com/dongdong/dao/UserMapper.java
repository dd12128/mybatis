package com.dongdong.dao;

import com.dongdong.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserLike(String value);
    List<User> getUserList();
    //查询id
    User getUserById(int id);
    //Map
    int addUser2(Map<String,Object> map) ;
    //insert插入
    int addUser(User user);
}

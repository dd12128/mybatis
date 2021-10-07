package com.dongdong.dao;

import com.dongdong.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.security.SecureRandom;
import java.security.SecureRandomSpi;
import java.util.List;

public interface UserMapper {
    User queryUserId(@Param("id")int id);
}

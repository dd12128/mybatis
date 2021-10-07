package com.dongdong.dao;

import com.dongdong.pojo.User;
import com.dongdong.utlis.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test() {
        //获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
//        List<User> userList = userDao.getUserList();
//        for (User user : userList) {
//            System.out.println(user);
//        }
        User userById = userDao.getUserById(1);
        System.out.println(userById);

        //关闭sqlSession
        sqlSession.close();
    }
}

package com.dongdong.dao;

import com.dongdong.pojo.User;
import com.dongdong.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserDaoTest {
    @Test
    public void test() {
        //��ȡsqlSession����
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }

        //�ر�sqlSession
        sqlSession.close();
    }
    @Test
    public void UserTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);


        sqlSession.close();
    }
    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.addUser(new User(4,"����","123456"));
        System.out.println(i > 0?"�ɹ�":"ʧ��");
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void addUser2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("userid",5);
        map.put("username","����");
        map.put("password","123456");
        int i = mapper.addUser2(map);
        System.out.println(i > 0?"�ɹ�":"ʧ��");
        sqlSession.commit();
        sqlSession.close();

    }
}

package com.dongdong.dao;

import com.dongdong.pojo.User;
import com.dongdong.utlis.MybatisUtils;
import org.apache.ibatis.cursor.Cursor;
import org.apache.ibatis.session.RowBounds;
import org.apache.log4j.Logger;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserDaoTest {
   static Logger logger = Logger.getLogger(UserDaoTest.class);
    @Test
    public void test() {
        //获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }

        //关闭sqlSession
        sqlSession.close();
    }
    @Test
    public void test04() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        RowBounds rowBounds = new RowBounds(1, 2);
        List<User> userlist = sqlSession.selectList("com.dongdong.dao.UserMapper.getUserLimit", null, rowBounds);
        for (User user : userlist) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}

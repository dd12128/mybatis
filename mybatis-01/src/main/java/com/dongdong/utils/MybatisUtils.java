package com.dongdong.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//SqlSessionFactory  --> SqlSession
public class MybatisUtils {
    private static SqlSessionFactory sql;
    static {
        try {
            //��ȡSqlSessionFactory����
            String resources = "mybatis-config.xml";
           InputStream inputStream = Resources.getResourceAsStream(resources);
           sql = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession getSqlSession() {
        return sql.openSession();
    }
}

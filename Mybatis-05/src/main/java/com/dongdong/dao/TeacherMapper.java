package com.dongdong.dao;

import com.dongdong.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    //获取老师
//    List<Teacher> getTeacher();
    Teacher getTeacher(@Param("tid")int id);
    Teacher getTeacher2(@Param("tid")int id);
}


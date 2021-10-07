package com.dongdong.dao;

import com.dongdong.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    int add(Blog blog);

    //查询博客
    List<Blog> queryBlogIF(Map map);

    List<Blog> queryBlogChoose(Map map);

    int updateBlog(Map map);

    List<Blog> queryBlogForeach(Map map);
}

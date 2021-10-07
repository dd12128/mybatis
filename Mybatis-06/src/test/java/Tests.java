import com.dongdong.dao.BlogMapper;
import com.dongdong.pojo.Blog;
import com.dongdong.utlis.IDutils;
import com.dongdong.utlis.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Tests {
    public static void main(String[] args) {

    }

    @Test
    public void test() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDutils.getId());
        blog.setTitle("Mtbatis如此简单");
        blog.setAuthor("狗子");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.add(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("Java如此简单");
        mapper.add(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("Spring如此简单");
        mapper.add(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("微服务如此简单");
        mapper.add(blog);



        sqlSession.close();

    }

    @Test
    public void Test2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        List<Blog> blogs = mapper.queryBlogIF(map);
        for (Blog blog : blogs) {
            System.out.println(blogs);
        }
        sqlSession.close();
    }
    @Test
    public void Test3() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        ArrayList ids = new ArrayList();
        map.put("ids",ids);
        List<Blog> blogs = mapper.queryBlogForeach(map);
        for (Blog blog : blogs) {
            System.out.println(blogs);
        }


        sqlSession.close();


    }

}


import com.dongdong.dao.TeacherMapper;
import com.dongdong.pojo.Teacher;
import com.dongdong.utlis.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Tests {
    public static void main(String[] args) {

    }

        @Test
        public void Test() {
            SqlSession sqlSession = MybatisUtils.getSqlSession();
            TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
            Teacher teachers = mapper.getTeacher(1);

            System.out.println(teachers);


            sqlSession.close();

        }
    @Test
    public void Test2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher2 = mapper.getTeacher2(1);

        System.out.println(teacher2);


        sqlSession.close();

    }
}

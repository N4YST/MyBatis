package com.nayst.test;

import com.nayst.mapper.SpecialMapper;
import com.nayst.pojo.User;
import com.nayst.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Date: 2023/4/15
 * Author: Administrator
 * Description:
 */
public class SpecialTest {

    @Test
    public void getUserByLike() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);

        List<User> list = mapper.getUserByLike("a");
        list.forEach(System.out::println);
    }

    @Test
    public void deleteMoreUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);

        mapper.deleteMoreUser("9,10");
    }

    @Test
    public void getUserList() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);

        List<User> list = mapper.getUserList("t_user");
        list.forEach(System.out::println);
    }

    @Test
    public void insertUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);

        User user = new User(null, "admin", "admin", 23, "female", "root@qq.com");
        mapper.insertUser(user);
        System.out.println(user);
    }

}

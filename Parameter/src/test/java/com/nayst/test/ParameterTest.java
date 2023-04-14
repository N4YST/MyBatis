package com.nayst.test;

import com.nayst.mapper.UserMapper;
import com.nayst.pojo.User;
import com.nayst.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


/**
 * Date: 2023/4/13
 * Author: Administrator
 * Description:
 */
public class ParameterTest {
    @Test
    public void testGetUserByUsername() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(userMapper.getUsername("nayst"));
    }
    @Test
    public void checkLogin() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.checkLogin("admin", "admin");
        System.out.println(user);
    }
    @Test
    public void checkLoginByMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<>();
        map.put("username", "admin");
        map.put("password", "admin");
        User user = userMapper.checkLoginByMap(map);
        System.out.println(user);
    }
    @Test
    public void insertUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User(null, "root", "root", 23, "female", "root@qq.com");
        userMapper.insertUser(user);
    }
    @Test
    public void checkLoginByParam() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.checkLoginByParam("admin", "admin");
        System.out.println(user);
    }
}

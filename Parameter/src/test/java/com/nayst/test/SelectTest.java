package com.nayst.test;

import com.nayst.mapper.SelectMapper;
import com.nayst.pojo.User;
import com.nayst.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * Date: 2023/4/14
 * Author: Administrator
 * Description:
 */
public class SelectTest {
    @Test
    public void getUserById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

        User user = mapper.getUserById(1);
        System.out.println(user);
    }
    @Test
    public void getAllUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

        List<User> list = mapper.getAllUser();
        list.forEach(System.out::println);
    }
    @Test
    public void getCount() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

        Integer count = mapper.getCount();
        System.out.println(count);
    }
    @Test
    public void getUserByIdToMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

        Map<String, Object> map = mapper.getUserByIdToMap(1);
        System.out.println(map);
    }
    @Test
    public void getAllUserToMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);

        Map<String, Object> map = mapper.getAllUserToMap();
        System.out.println(map);
    }
}

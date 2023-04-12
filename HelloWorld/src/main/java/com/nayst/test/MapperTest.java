package com.nayst.test;

import com.nayst.mapper.UserMapper;
import com.nayst.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Date: 2023/4/12
 * Author: Administrator
 * Description:
 */
public class MapperTest {
    public static void main(String[] args) throws IOException {
        // 获取核心配置文件的输入流
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        // 获取SqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        // 获取SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);

        // 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);

        // 执行查询
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectAll();

        // 打印结果
        System.out.println(users);

        // 释放资源
        sqlSession.close();
    }
}

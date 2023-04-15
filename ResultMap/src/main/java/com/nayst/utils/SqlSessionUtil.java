package com.nayst.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Date: 2023/4/12
 * Author: Administrator
 * Description:
 */
public class SqlSessionUtil {
    public static SqlSession getSqlSession(){
        SqlSession sqlSession = null;
        try {
            // 获取输入流
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

            // 获取SqlSessionFactoryBuilder
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

            // 获取SqlSessionFactory
            SqlSessionFactory factory = builder.build(is);

            // 获取SqlSession
            sqlSession = factory.openSession(true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sqlSession;
    }
}

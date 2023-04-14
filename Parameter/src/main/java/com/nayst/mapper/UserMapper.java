package com.nayst.mapper;

import com.nayst.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * Date: 2023/4/12
 * Author: Administrator
 * Description:
 */
public interface UserMapper {
    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    User getUsername(String username);

    /**
     * 验证登录
     * @param username
     * @param password
     * @return
     */
    User checkLogin(String username, String password);

    /**
     * 验证登录（以map集合为参数）
     * @param map
     * @return
     */
    User checkLoginByMap(Map<String, Object> map);

    /**
     * 添加用户信息
     * @param user
     */
    void insertUser(User user);

    /**
     * 验证登录（使用@Param注解）
     * @param username
     * @param password
     * @return
     */
    User checkLoginByParam(@Param("aaa") String username, @Param("bbb") String password);
}

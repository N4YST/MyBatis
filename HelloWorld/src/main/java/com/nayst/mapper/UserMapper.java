package com.nayst.mapper;

import com.nayst.pojo.User;

import java.util.List;

/**
 * Date: 2023/4/12
 * Author: Administrator
 * Description:
 */
public interface UserMapper {
    /**
     * 添加用户信息
     * @return
     */
    int insertUser();

    /**
     * 修改用户信息
     * @return
     */
    void updateUser();

    /**
     * 删除用户信息
     * @return
     */
    void deleteUser();

    /**
     * 查询用户信息
     * @return
     */
    List<User> selectAll();
}

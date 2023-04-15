package com.nayst.mapper;

import com.nayst.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Date: 2023/4/15
 * Author: Administrator
 * Description:
 */
public interface SpecialMapper {
    /**
     * 模糊查询
     * @param like
     * @return
     */
    List<User> getUserByLike(@Param("like") String like);

    /**
     * 批量删除
     * @param id
     */
    void deleteMoreUser(@Param("id") String id);

    /**
     * 动态设置表名
     * @param tableName
     * @return
     */
    List<User> getUserList(@Param("tableName") String tableName);

    /**
     * 添加用户信息并获取自增的主键
     * @param user
     */
    void insertUser(User user);

}

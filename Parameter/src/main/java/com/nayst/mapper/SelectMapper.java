package com.nayst.mapper;

import com.nayst.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Date: 2023/4/14
 * Author: Administrator
 * Description:
 */
public interface SelectMapper {

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    User getUserById(@Param("id") Integer id);

    /**
     * 查询所有用户信息
     * @return
     */
    List<User> getAllUser();

    /**
     * 查询总数
     * @return
     */
    Integer getCount();

    /**
     * 根据id查询用户信息返回map集合
     * @param id
     * @return
     */
    Map<String, Object> getUserByIdToMap(@Param("id") Integer id);

    /**
     * 查询所有的用户信息为map集合
     * @return
     */
    @MapKey("id")
    Map<String, Object> getAllUserToMap();
}

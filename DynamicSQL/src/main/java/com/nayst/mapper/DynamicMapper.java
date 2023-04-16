package com.nayst.mapper;

import com.nayst.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Date: 2023/4/16
 * Author: Administrator
 * Description:
 */
public interface DynamicMapper {
    /**
     * 根据员工条件查询
     * @param emp
     * @return
     */
    List<Emp> getEmpByCondition(Emp emp);

    /**
     * 通过choose查询员工信息
     * @param emp
     * @return
     */
    List<Emp> getEmpByChoose(Emp emp);

    /**
     * 批量添加员工信息
     * @param empList
     */
    void insertMoreEmp(@Param("empList") List<Emp> empList);

    /**
     * 批量删除
     * @param empIds
     */
    void deleteMoreEmp(@Param("empIds") Integer[] empIds);

}

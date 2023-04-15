package com.nayst.mapper;

import com.nayst.pojo.Dept;
import com.nayst.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Date: 2023/4/15
 * Author: Administrator
 * Description:
 */
public interface EmpMapper {

    /**
     * 通过员工id获取员工信息
     * @param empId
     * @return
     */
    Emp getEmpByEmpId(@Param("id") Integer empId);

    /**
     * 获取员工以及所对应的部门信息
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByEmpId(@Param("id") Integer empId);

    /**
     * 分步查询获取员工以及所对应的部门信息
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByEmpIdByStepOne(@Param("id") Integer empId);

    /**
     * 分步查询获取部门信息以及所有员工
     * @param empId
     * @return
     */
    List<Emp> getDeptAndEmpByDeptIdByStepTwo(@Param("id") Integer deptId);

}

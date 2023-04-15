package com.nayst.mapper;

import com.nayst.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * Date: 2023/4/15
 * Author: Administrator
 * Description:
 */
public interface DeptMapper {
    /**
     * 分步查询获取员工以及所对应的部门信息
     * @param empId
     * @return
     */
    Dept getEmpAndDeptByEmpIdByStepTwo(@Param("id") Integer deptId);

    /**
     * 查询部门的所有员工
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByDeptId(@Param("id") Integer deptId);

    /**
     * 分步查询获取部门信息以及所有员工
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByDeptIdByStepOne(@Param("id") Integer deptId);
}

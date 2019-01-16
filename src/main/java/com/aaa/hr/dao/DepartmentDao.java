package com.aaa.hr.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * className:DepartmentDao
 * discription:
 * author:zn
 * createTime:2019-01-14 09:39
 */
public interface DepartmentDao {

    /**
     * 部门列表查询
     * @return
     */
    @Select("select deptno,dname,loc from department")
    List<Map> getDeptList();
}

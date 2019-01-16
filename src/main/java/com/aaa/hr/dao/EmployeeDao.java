package com.aaa.hr.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * className:EmployeeDao
 * discription:
 * author:zn
 * createTime:2019-01-14 09:39
 */
public interface EmployeeDao {

    /**
     * 按部门统计工资信息
     * @return
     */
    @Select("select d.dname,e.empyear,e.empmonth,AVG(e.empsalary) as salary from employee e,department d where e.deptno=d.deptno group by d.dname order by d.deptno,e.empyear,e.empmonth")
    List<Map> getSalaryInfo();
}

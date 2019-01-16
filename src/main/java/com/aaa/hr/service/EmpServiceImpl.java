package com.aaa.hr.service;

import com.aaa.hr.dao.DepartmentDao;
import com.aaa.hr.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * className:EmpServiceImpl
 * discription:
 * author:zn
 * createTime:2019-01-14 09:57
 */
@Service
public class EmpServiceImpl implements  EmpService {


    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao;
    @Override
    public Map getSalnfo() {
        List<Map> salaryInfo = employeeDao.getSalaryInfo();
        List<Map> deptList = departmentDao.getDeptList();
        Map map = new HashMap();
        map.put("salaryInfo",salaryInfo);
        map.put("deptList",deptList);
        return map;
    }
}

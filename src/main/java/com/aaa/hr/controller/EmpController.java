package com.aaa.hr.controller;

import com.aaa.hr.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * className:EmpController
 * discription:
 * author:zn
 * createTime:2019-01-14 10:01
 */
@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    /**
     * 员工工资信息
     * @return
     */
    @RequestMapping("/getSalInfo")
    @ResponseBody
    public  Object getSalInfo(){
        return empService.getSalnfo();
    }

    /**
     * 跳转员工工资信息方法
     * @return
     */
    @RequestMapping("toEmpSal")
    public String toEmpSal(){
        return "emp/empsal";
    }
    @RequestMapping("toEmpSalTwo")
    public String toEmpSalTwo(){
        return "emp/empsaltwo";
    }
}

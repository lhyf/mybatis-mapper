package org.lhyf.mybatis.controller;

import org.lhyf.mybatis.entity.Employee;
import org.lhyf.mybatis.model.Vo.EmployeeVo;
import org.lhyf.mybatis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/****
 * @author YF
 * @date 2018-11-05 10:28
 * @desc EmployeeController
 *
 **/

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @ResponseBody
    @GetMapping("/list-all")
    public List<Employee> listAll(){
        List<Employee> list = employeeService.getAll();
        return list;
    }
    @ResponseBody
    @GetMapping("/get-by-id")
    public Employee selectByPrimaryKey(){
        return employeeService.selectByPrimaryKey(1);
    }

    @ResponseBody
    @GetMapping("/get-by-custom")
    public EmployeeVo selectByCustom(){
        return employeeService.selectByCustom(1);
    }
}

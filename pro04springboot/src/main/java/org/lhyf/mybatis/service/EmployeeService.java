package org.lhyf.mybatis.service;

import org.lhyf.mybatis.entity.Employee;
import org.lhyf.mybatis.mapper.EmployeeMapper;
import org.lhyf.mybatis.model.Vo.EmployeeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/****
 * @author YF
 * @date 2018-11-05 10:28
 * @desc EmployeeService
 *
 **/

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> getAll() {
        return employeeMapper.selectAll();
    }

    public Employee selectByPrimaryKey(Integer i) {
        return employeeMapper.selectByPrimaryKey(i);
    }

    public EmployeeVo selectByCustom(int i) {
        EmployeeVo vo = employeeMapper.selectByCustom(i);
        System.out.println(vo);
        return vo;
    }
}

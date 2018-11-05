package org.lhyf.mybatis.services;

import org.lhyf.mybatis.entity.Employee;
import org.lhyf.mybatis.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/****
 * @author YF
 * @date 2018-10-27 18:57
 * @desc EmployeeService
 *
 **/

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public Employee selectByPrimaryKey(int i) {
        return employeeMapper.selectByPrimaryKey(i);
    }

    public List<Employee> selectByExample(Example example) {
        return employeeMapper.selectByExample(example);
    }
}

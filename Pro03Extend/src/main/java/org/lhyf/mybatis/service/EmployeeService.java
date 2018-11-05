package org.lhyf.mybatis.service;

import org.lhyf.mybatis.entity.Employee;
import org.lhyf.mybatis.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/****
 * @author YF
 * @date 2018-11-04 12:55
 * @desc EmployeeService
 *
 **/

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> selectAll() {
        return employeeMapper.selectAll();
    }

    public void batchUpdate(List<Employee> list) {
       employeeMapper.batchUpdate(list);
    }
}

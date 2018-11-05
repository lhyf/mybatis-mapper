package org.lhyf.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.lhyf.mybatis.entity.Employee;
import org.lhyf.mybatis.model.Vo.EmployeeVo;
import tk.mybatis.mapper.common.Mapper;

public interface EmployeeMapper extends Mapper<Employee> {

    EmployeeVo selectByCustom(@Param("id") Integer id);
}
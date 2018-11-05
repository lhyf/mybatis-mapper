package org.lhyf.mybatis.mapper;

import org.apache.ibatis.annotations.CacheNamespace;
import org.lhyf.mybatis.entity.Employee;
import org.lhyf.mybatis.mine_mapper.MyCustomMapper;
import tk.mybatis.mapper.common.Mapper;

//支持二级缓存
@CacheNamespace
public interface EmployeeMapper extends MyCustomMapper<Employee> {
}
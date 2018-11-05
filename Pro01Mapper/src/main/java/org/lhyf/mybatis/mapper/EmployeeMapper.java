package org.lhyf.mybatis.mapper;

import org.lhyf.mybatis.entity.Employee;
import tk.mybatis.mapper.common.Mapper;

/****
 * @author YF
 * @date 2018-10-27 18:56
 * @desc EmployeeMapper
 *
 * 具体操作数据库的Mapper,需要继承通用Mapper提供的核心接口 Mapper<Employee>
 * 泛型类型就是实体类的类型
 **/
public interface EmployeeMapper extends Mapper<Employee> {
}

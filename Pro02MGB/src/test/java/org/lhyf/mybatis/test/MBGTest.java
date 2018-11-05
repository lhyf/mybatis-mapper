package org.lhyf.mybatis.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.lhyf.mybatis.entity.Employee;
import org.lhyf.mybatis.mapper.EmployeeMapper;
import tk.mybatis.mapper.mapperhelper.MapperHelper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/****
 * @author YF
 * @date 2018-11-03 15:18
 * @desc MBGTest
 *
 **/
public class MBGTest {

    public static void main(String[] args) throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = sessionFactory.openSession();

        // *********************************************
        // 按照Java方式整合通用Mapper的特殊处理
        // 1.创建MapperHelper对象
        MapperHelper mapperHelper = new MapperHelper();
        // 2.通过MapperHelper对象对Mybatis原生的Configuration对象进行处理
        Configuration configuration = session.getConfiguration();
        mapperHelper.processConfiguration(configuration);
        // *********************************************

        EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
        List<Employee> employees = employeeMapper.selectAll();

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

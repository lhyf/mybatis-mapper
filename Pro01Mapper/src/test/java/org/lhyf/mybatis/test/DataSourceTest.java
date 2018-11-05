package org.lhyf.mybatis.test;

import org.junit.Test;
import org.lhyf.mybatis.entity.Employee;
import org.lhyf.mybatis.services.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tk.mybatis.mapper.entity.Example;

import javax.sql.DataSource;
import java.util.List;

/****
 * @author YF
 * @date 2018-10-23 23:53
 * @desc DataSourceTest
 *
 **/
public class DataSourceTest {
    private ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
    private DataSource dataSource = ctx.getBean(DataSource.class);
    private EmployeeService employeeService = ctx.getBean(EmployeeService.class);

    @Test
    public void getDataSource() throws Exception{
        System.out.println(dataSource.getConnection());
    }

    @Test
    public void testSelectByPrimaryKey(){
        Employee employee = employeeService.selectByPrimaryKey(1);
        System.out.println(employee);
    }

    @Test
    public void testSelectByExample(){
        Example example = new Example(Employee.class);
        Example.Criteria criteria01 = example.createCriteria();
        Example.Criteria criteria02 = example.createCriteria();

        // (emp_salary > 1500 and emp_age < 30) OR (emp_salary < 5000 and emp_age > 35)
        criteria01.andGreaterThan("empSalary",1500)
                .andLessThan("empAge",30);
        criteria02.andLessThan("empSalary",5000)
                .andGreaterThan("empAge",35);

        example.or(criteria02);
        example.selectProperties("empId","empName");
        example.orderBy("empSalary").asc().orderBy("empAge").desc();
        example.setDistinct(true);

        List<Employee> empList = employeeService.selectByExample(example);
        for(Employee emp:empList){
            System.out.println(emp);
        }
    }
}

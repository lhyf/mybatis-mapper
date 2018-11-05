package org.lhyf.mybatis.test;

import org.junit.Before;
import org.junit.Test;
import org.lhyf.mybatis.entity.Employee;
import org.lhyf.mybatis.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/****
 * @author YF
 * @date 2018-11-04 12:58
 * @desc CustomMapperTest
 *
 **/
public class CustomMapperTest {
    private ApplicationContext ctx;
    private EmployeeService employeeService;

    @Before
    public void init(){
        ctx = new ClassPathXmlApplicationContext("application.xml");
        employeeService = ctx.getBean(EmployeeService.class);
    }

    @Test
    public void testMineMapper(){
        List<Employee> employees = employeeService.selectAll();
        for(Employee employee:employees){
            System.out.println(employee);
        }
    }

    @Test
    public void testBatchUpdate(){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"emp01",2500.0,23));
        list.add(new Employee(2,"emp02",2600.0,null));
        list.add(new Employee(3,"emp03",2700.0,25));
        list.add(new Employee(4,"emp04",2800.0,26));
        employeeService.batchUpdate(list);
    }

    /**
     * 如何开启二级缓存
     * 1.mybatis 文件开启二级缓存功能
     * 2.在XxxMapper 接口上使用@CacheNamespace
     * 3.缓存的实体类需要支持序列化
     */
    @Test
    public void testCache(){
        List<Employee> employees1 = employeeService.selectAll();
        for(Employee employee:employees1){
            System.out.println(employee);
        }

        List<Employee> employees2 = employeeService.selectAll();
        for(Employee employee:employees2){
            System.out.println(employee);
        }
    }


}

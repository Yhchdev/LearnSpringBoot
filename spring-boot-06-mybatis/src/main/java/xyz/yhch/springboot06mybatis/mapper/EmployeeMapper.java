package xyz.yhch.springboot06mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import xyz.yhch.springboot06mybatis.bean.Employee;

@Mapper
public interface EmployeeMapper {

    public int addEmployee(Employee employee);

    public Employee queryEmployee(Integer id);


}

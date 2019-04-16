package xyz.yhch.springboot06mybatis.controll;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xyz.yhch.springboot06mybatis.bean.Department;
import xyz.yhch.springboot06mybatis.bean.Employee;
import xyz.yhch.springboot06mybatis.mapper.DepartmentMapper;
import xyz.yhch.springboot06mybatis.mapper.EmployeeMapper;

@RestController
public class DeptControll {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;


    @GetMapping("/dept/{id}")
    public Department queryDept(@PathVariable("id") Integer id){
        Department department = departmentMapper.queryDepartment(id);
        return department;
    }

    @GetMapping("/dept")
    public Department addDept(Department department){
        departmentMapper.addDepartment(department);
        return department;
    }

    @GetMapping("/emp/{id}")
    public Employee queryEmp(@PathVariable("id") Integer id){
        Employee employee = employeeMapper.queryEmployee(id);
        return employee;
    }


}

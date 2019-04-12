package xyz.yhch.springboot04webrestfulcurd.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import xyz.yhch.springboot04webrestfulcurd.dao.DepartmentDao;
import xyz.yhch.springboot04webrestfulcurd.dao.EmployeeDao;
import xyz.yhch.springboot04webrestfulcurd.entities.Department;
import xyz.yhch.springboot04webrestfulcurd.entities.Employee;

import java.util.Collection;

@Controller
public class EmployeeControll {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;


    @RequestMapping("/emps")
    public String getEmplist(Model model){
        //查询所有的雇员信息
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps",employees);
        return "emp/list";
    }


    //去到员工添加页面
    @GetMapping("/emp")
    public String getAddpage(Model model){

        //将部门信息绑定到option上面
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);

        return "emp/add";
    }

    //添加员工
    @PostMapping("/emp")
    //Springmvc自动将入参与pogo实体进行数据绑定(自动封装):要求入参与实体属性名相同
    public String addEmp(Employee employee){
        employeeDao.save(employee);
        //添加成功返回查询页面
        return "redirect:/emps";
    }



    //删除员工
    @DeleteMapping("/emp/{id}")
    public String delectEmp(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/emps";
    }


    //去到修改页面
    @GetMapping("/emp/{id}")
    public String toEditpage(@PathVariable("id") Integer id,Model model){
        //根据id查询员工信息进行回显
        Employee employee = employeeDao.get(id);
        model.addAttribute("emp",employee);


        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts",departments);
        return "emp/add";
    }


    //修改页面

    @PutMapping("/emp")
    public String update(Employee employee){
        employeeDao.save(employee);
        return "redirect:/emps";
    }
}

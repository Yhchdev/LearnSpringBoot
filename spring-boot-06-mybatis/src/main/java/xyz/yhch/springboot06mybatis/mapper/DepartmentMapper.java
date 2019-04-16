package xyz.yhch.springboot06mybatis.mapper;


import org.apache.ibatis.annotations.*;
import xyz.yhch.springboot06mybatis.bean.Department;

@Mapper
public interface DepartmentMapper {

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department(department_name) values(#{departmentName})")
    public int addDepartment(Department department);

    @Delete("delete from department where id =#{id}")
    public int deleteDepartment(Integer id);

    @Update("update department set department_name=#{departmentName} where id=#{id} ")
    public int updateDepartment(Department department);

    @Select("select * from department where id=#{id}")
    public Department queryDepartment(Integer id);



}

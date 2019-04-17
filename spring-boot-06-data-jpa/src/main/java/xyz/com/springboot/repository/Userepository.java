package xyz.com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.com.springboot.entity.User;


//JpaRepository<实体类, 主键数据类型>
public interface Userepository extends JpaRepository<User, Integer> {


}

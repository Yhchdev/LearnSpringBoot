package com.example.springboot08mybatisplus;

import com.example.springboot08mybatisplus.Do.User;
import com.example.springboot08mybatisplus.Mapper.UserMapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot08MybatisplusApplicationTests {


    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
    }



    @Test
    public void selectAll(){

        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

}

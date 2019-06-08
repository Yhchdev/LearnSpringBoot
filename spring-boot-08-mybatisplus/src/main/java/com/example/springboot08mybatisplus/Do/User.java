package com.example.springboot08mybatisplus.Do;


import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}

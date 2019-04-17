package xyz.com.springboot.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@JsonIgnoreProperties(value = {"handler","hibernateLazyInitializer","fieldHandler"})
@Entity //指明这是一个Entity实体类,与数据表映射
@Table(name = "tb_user")  //说明与哪一个表映射,如果省略创建的表名为user,即类名小写
public class User {

    @Id //指明这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //自增
    private Integer id;

    @Column(name = "last_name",length = 50) //对应数据表的列名
    private String LastName;

    @Column  //默认列名就是属性名
    private String email;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

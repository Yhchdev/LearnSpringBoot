package xyz.com.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xyz.com.springboot.entity.User;
import xyz.com.springboot.repository.Userepository;

@RestController
public class UserControll{

    @Autowired
    Userepository userepository;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        User user = userepository.getOne(id);
        return user;
    }

    @GetMapping("/user")
    public User addUser(User user){
        User save = userepository.save(user);
        return save;
    }

}

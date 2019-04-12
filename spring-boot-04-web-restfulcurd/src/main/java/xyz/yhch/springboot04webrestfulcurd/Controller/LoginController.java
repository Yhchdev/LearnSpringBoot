package xyz.yhch.springboot04webrestfulcurd.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {
    @PostMapping(value ="/user/login") //接收post请求
    public String Login(@RequestParam("userName") String username,
                        @RequestParam("userPassword") String userpassword,
                        Map<String,Object> map, HttpSession session)
    {
        if(!StringUtils.isEmpty(username) && userpassword.equals("666")){
            //将登陆信息绑定到session中
            session.setAttribute("loginUser",username);
            //登录成功，为防止表单重复提交,重定向到主页
            return "redirect:/Main.html";

        }else {
            map.put("msg","用户名或密码错误");
            return "login";
        }

    }
}

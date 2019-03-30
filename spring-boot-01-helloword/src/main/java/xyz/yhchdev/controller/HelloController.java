package xyz.yhchdev.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@ResponseBody
public class HelloController {
    @RequestMapping("/test")
    public Map<String,String> test(){
        Map<String,String> map = new HashMap<String, String>();
        map.put("key","value");
        return map;
    }

}

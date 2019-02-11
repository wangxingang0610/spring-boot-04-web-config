package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class HelloController {




    @RequestMapping("/success")
    public String success(Map<String,Object> map){

        map.put("hello","1111111111111111");
        return "success";
    }
}

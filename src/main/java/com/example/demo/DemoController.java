package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @RequestMapping(value = "/")
    @ResponseBody
    public String index(){
        return "index";
    }

    @RequestMapping(value="/api/security")
    @ResponseBody
    public String security(){
        return "security";
    }
}

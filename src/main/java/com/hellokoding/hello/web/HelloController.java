package com.hellokoding.hello.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.hellokoding.hello.entity.*;
@Controller
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
    
    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello1(@RequestParam(value="name", required=false, defaultValue="World1") String name, Model model) {
        model.addAttribute("name", name);
        return "hello1";
    }
}
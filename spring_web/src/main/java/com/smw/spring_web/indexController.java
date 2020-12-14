package com.smw.spring_web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
    
    @RequestMapping("/")
    public String index() {
        System.out.println("index 실행 테스트");
        return "test";
    }
}

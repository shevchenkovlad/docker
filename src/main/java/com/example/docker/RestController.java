package com.example.docker;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestController {

    @RequestMapping("/")
    public String start(){
        return "Hello World Docker";
    }
}

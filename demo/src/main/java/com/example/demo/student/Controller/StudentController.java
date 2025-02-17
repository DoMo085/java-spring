package com.example.demo.student.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController 
@RequestMapping("/api")
public class StudentController {

    @GetMapping("/test")
    public String getMethodName() {
        return "Hello";
    }
    
}
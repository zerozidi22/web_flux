package com.example.toy.controller;

import com.example.toy.service.studentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
@RequiredArgsConstructor
public class studentController {

    studentService studentService;

    @GetMapping("/a")
    public void getStudent(){
        studentService.test();
    }
}

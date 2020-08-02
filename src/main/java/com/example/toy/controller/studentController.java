package com.example.toy.controller;

import com.example.toy.service.studentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;

@Controller
@RequiredArgsConstructor
public class studentController {

    @Autowired
    studentService studentService;

    @RequestMapping(value = "/test")
    public Mono<String> getStudent(){
        studentService.test();
//        System.out.println("hi");
        return Mono.just("a");
    }
}

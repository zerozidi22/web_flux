package com.example.toy.service;

import com.example.toy.entity.student;
import com.example.toy.repository.studentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class studentService {

    @Autowired
    studentRepository stR;

    public void test(){

        stR.findByStuId("1").ifPresent(s -> System.out.println(s.getStuNm() + "//" + s.getStuId()));

    }

}

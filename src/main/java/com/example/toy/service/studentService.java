package com.example.toy.service;

import com.example.toy.repository.studentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class studentService {

    studentRepository stR;

    public void test(){

        if(stR.findByStuId("1").isPresent()){
            System.out.println("hihi" + stR.findByStuId("1").isPresent());
        } else {
            System.out.println("hihi");
        }

    }

}

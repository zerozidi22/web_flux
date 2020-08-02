package com.example.toy.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class student {

    @Id
    public String stuId;

    public String stuNm;

}

package com.example.toy.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "student")
public class student {

    @Id
    @Column(name="stuid", nullable = false, unique = true)
    private String stuId;

    @Column(name="stunm", nullable = false, unique = true)
    private String stuNm;

}

package com.example.toy.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class subject {

    @Id
    @Column(name="stuid", nullable = false, unique = true)
    public String stuId;

    @Column(name="subjectnm", nullable = false, unique = false)
    public String subjectNm;
}

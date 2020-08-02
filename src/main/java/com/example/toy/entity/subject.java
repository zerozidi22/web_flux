package com.example.toy.entity;


import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class subject {

    @Id
    public String stuId;

    public String subjectNm;
}

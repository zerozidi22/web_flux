package com.example.toy.repository;


import com.example.toy.entity.subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface subjectRepository extends JpaRepository<subject, String> {

}

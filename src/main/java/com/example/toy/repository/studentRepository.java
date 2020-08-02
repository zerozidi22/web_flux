package com.example.toy.repository;

import com.example.toy.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.Optional;


@Repository
public interface studentRepository extends JpaRepository<student, String> {
    Optional<student> findByStuId(String s);
}

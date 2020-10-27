package com.example.School.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.School.Entity.ClazzBelong;

@Repository
public interface ClazzBelongRepo extends JpaRepository<ClazzBelong, Long> {
	ClazzBelong findClazzBelongById(Long id);
}

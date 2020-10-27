package com.example.School.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.School.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {
	Student findStudentById(Long id);
}

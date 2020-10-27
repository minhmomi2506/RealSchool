 package com.example.School.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.School.Entity.Teacher;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Long>{
	Teacher findTeacherById(Long id);
}

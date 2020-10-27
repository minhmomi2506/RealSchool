package com.example.School.StudentService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.School.Entity.Student;

@Service
public interface StudentService {
	Student insertStudent(Student student);

	List<Student> findAllStudents();
	
	Student findById(Long id);
	
	void deleteById(Long id);
	
	Student updatePhoneNumber(Long id , Student student);
	
	List<Student> sortByName();
}

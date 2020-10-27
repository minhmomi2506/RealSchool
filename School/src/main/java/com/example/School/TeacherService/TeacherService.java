package com.example.School.TeacherService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.School.Entity.Teacher;

@Service
public interface TeacherService {
	Teacher insertTeacher(Teacher teacher);

	List<Teacher> findAllTeachers();

	Teacher findTeacherById(Long id);

	void deleteById(Long id);

	Teacher updatePhoneNumber(Long id, Teacher teacher);
	
	List<Teacher> sortByName();

}

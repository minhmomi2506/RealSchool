package com.example.School.TeacherService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.example.School.Entity.Teacher;
import com.example.School.Repo.TeacherRepo;

@Component
public class TeacherServiceImp implements TeacherService {
	@Autowired
	private TeacherRepo teacherrepo;

	@Override
	public Teacher insertTeacher(Teacher teacher) {
		return teacherrepo.save(teacher);
	}

	@Override
	public List<Teacher> findAllTeachers() {
		return teacherrepo.findAll();
	}

	@Override
	public Teacher findTeacherById(Long id) {
		return teacherrepo.findTeacherById(id);
	}

	@Override
	public void deleteById(Long id) {
		teacherrepo.deleteById(id);
	}

	@Override
	public Teacher updatePhoneNumber(Long id, Teacher teacher) {
		Teacher teacher1 = teacherrepo.findTeacherById(id);
		if (teacher1 != null) {
			teacher1.setPhoneNumber(teacher.getPhoneNumber());
			return teacherrepo.save(teacher1);
		} else {
			return null;
		}
	}

	@Override
	public List<Teacher> sortByName() {
		return teacherrepo.findAll(sortByNameASC());
	}

	private Sort sortByNameASC() {
		Sort sort = Sort.by("name").ascending();
		return sort;
	}
}

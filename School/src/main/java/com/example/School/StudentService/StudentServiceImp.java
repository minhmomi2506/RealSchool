package com.example.School.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.example.School.Entity.Student;
import com.example.School.Repo.StudentRepo;

@Component
public class StudentServiceImp implements StudentService {
	@Autowired
	private StudentRepo studentrepo;

	@Override
	public Student insertStudent(Student student) {
		return studentrepo.save(student);
	}

	@Override
	public List<Student> findAllStudents() {
		return studentrepo.findAll();
	}

	@Override
	public Student findById(Long id) {
		return studentrepo.findStudentById(id);
	}

	@Override
	public void deleteById(Long id) {
		studentrepo.deleteById(id);
	}

	@Override
	public Student updatePhoneNumber(Long id, Student student) {
		Student student1 = studentrepo.findStudentById(id);
		if (student1 != null) {
			student1.setPhoneNumber(student.getPhoneNumber());
			return studentrepo.save(student1);

		} else
			return null;
	}

	@Override
	public List<Student> sortByName() {
		return studentrepo.findAll(sortByNameASC());
	}
	
	private Sort sortByNameASC() {
		Sort sort = Sort.by("name").ascending();
		return sort;
	}
}

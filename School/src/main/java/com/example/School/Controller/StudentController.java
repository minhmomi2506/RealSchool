package com.example.School.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.School.ClazzBelongService.ClazzBelongService;
import com.example.School.Entity.Student;
import com.example.School.StudentService.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentservice;

	@Autowired
	private ClazzBelongService clazzbelongservice;

	/**
	 * INSERT STUDENT
	 * 
	 * @param student
	 * @return
	 */
	@PostMapping("/insertStu/{id}")
	public Student insert(@RequestBody Student student, @PathVariable Long id) {
		studentservice.insertStudent(student);
		student.setClazzbelong(clazzbelongservice.findClazzBelongById(id));
		return studentservice.insertStudent(student);
	}

	/**
	 * GET ALL STUDENT
	 * 
	 * @return
	 */
	@GetMapping("/findAllStu")
	@Cacheable(value = "cachetStu")
	public List<Student> findAll() {
		return studentservice.findAllStudents();
	}

	/**
	 * FIND STUDENT BY ID
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/findById/{id}")
	@Cacheable(value = "cachetStuById")
	public Student findById(@PathVariable Long id) {
		return studentservice.findById(id);
	}

	/**
	 * DELETE BY ID
	 * 
	 * @param id
	 */
	@DeleteMapping("/deleteById/{id}")
	public void deleteById(@PathVariable Long id) {
		studentservice.deleteById(id);
	}

	/**
	 * UPDATE PHONE NUMBER
	 * 
	 * @param id
	 * @param student
	 * @return
	 */
	@PutMapping("/updatePhoneNumber/{id}")
	public Student updatePhoneNumber(@PathVariable Long id, @RequestBody Student student) {
		return studentservice.updatePhoneNumber(id, student);
	}

	/**
	 * SORT BY NAME ASC
	 */
	@GetMapping("/sortByNameASC")
	public List<Student> sortByNameASC() {
		return studentservice.sortByName();
	}
}

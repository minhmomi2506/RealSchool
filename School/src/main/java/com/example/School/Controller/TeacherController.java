package com.example.School.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.School.Entity.Teacher;
import com.example.School.TeacherService.TeacherService;

import lombok.extern.slf4j.Slf4j;

@RestController
@CrossOrigin(maxAge = 3600)
@Slf4j
public class TeacherController {
	@Autowired
	private TeacherService teacherservice;

	/**
	 * INSERT TEACHER
	 * 
	 * @param teacher
	 * @return
	 */
	@PostMapping("/insertTeacher")
	public Teacher insertTeacher(@RequestBody Teacher teacher) {
		log.info("INFO");
		;
		return teacherservice.insertTeacher(teacher);
	}

	/**
	 * FIND ALL TEACHER
	 */
	@GetMapping("/findAllTeachers")
	public List<Teacher> findAllTeachers() {
		log.debug("DEBUG");
		log.info("INFO");
		log.error("ERROR");
		System.out.println("with Cache Method");
		return teacherservice.findAllTeachers();
	}

	/**
	 * FIND TEACHER BY ID
	 */
	@GetMapping("/findTeacherById/{id}")
	public Teacher findById(@PathVariable Long id) {
		System.out.println("Without cache method");
		return teacherservice.findTeacherById(id);
	}

	/**
	 * DELETE TEACHER BY ID
	 */
	@DeleteMapping("/deleteTeacherById/{id}")
	public void deleteById(@PathVariable Long id) {
		teacherservice.deleteById(id);
	}

	/**
	 * UPDATE TEACHER PHONE NUMBER
	 */
	@PutMapping("/updateTeacherPhoneNumber/{id}")
	public Teacher updatePhoneNumber(@PathVariable Long id, @RequestBody Teacher teacher) {
		return teacherservice.updatePhoneNumber(id, teacher);
	}

	/**
	 * SORT TEACHER BY NAME ASC
	 */
	@GetMapping("/sortTeacherByNameASC")
	public List<Teacher> sortNameASC() {
		return teacherservice.sortByName();
	}
}

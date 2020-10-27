package com.example.School.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.School.ComputerStuService.ComputerStuService;
import com.example.School.Entity.ComputerStu;
import com.example.School.StudentService.StudentService;

@RestController
public class ComputerStuController {
	@Autowired
	private ComputerStuService computerstuservice;
	
	@Autowired
	private StudentService studentservice;

	@PostMapping("/insertComStu")
	public ComputerStu insert(@RequestBody ComputerStu computerstu) {
		computerstuservice.insertComputer(computerstu);
		computerstu.setStudent(studentservice.findById(computerstu.getId()));
		return computerstuservice.insertComputer(computerstu);
	}
}

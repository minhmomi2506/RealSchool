package com.example.School.ComputerStuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.School.Entity.ComputerStu;
import com.example.School.Repo.ComputerStuRepo;

@Component
public class ComputerStuServiceImp implements ComputerStuService {
	@Autowired
	private ComputerStuRepo computersturepo;

	@Override
	public ComputerStu insertComputer(ComputerStu computerstu) {
		return computersturepo.save(computerstu);
	}
	
	@Override
	public ComputerStu findComPuterById(Long id) {
		return computersturepo.findComputerById(id);
	}

}

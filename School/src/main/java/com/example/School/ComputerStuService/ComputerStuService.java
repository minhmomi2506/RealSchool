package com.example.School.ComputerStuService;

import org.springframework.stereotype.Service;

import com.example.School.Entity.ComputerStu;

@Service
public interface ComputerStuService {
	ComputerStu insertComputer(ComputerStu computerstu);
	
	ComputerStu findComPuterById(Long id);
}


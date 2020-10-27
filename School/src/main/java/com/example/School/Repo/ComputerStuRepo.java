package com.example.School.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.School.Entity.ComputerStu;

public interface ComputerStuRepo extends JpaRepository<ComputerStu, Long>{
	ComputerStu findComputerById(Long id);
}

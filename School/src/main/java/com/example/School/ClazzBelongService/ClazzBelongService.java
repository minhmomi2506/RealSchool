package com.example.School.ClazzBelongService;

import org.springframework.stereotype.Service;

import com.example.School.Entity.ClazzBelong;

@Service
public interface ClazzBelongService {
	ClazzBelong insertClazz(ClazzBelong clazzbelong);
	
	ClazzBelong findClazzBelongById(Long id);
	
}

package com.example.School.ClazzBelongService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.School.Entity.ClazzBelong;
import com.example.School.Repo.ClazzBelongRepo;

@Component
public class ClazzBelongServiceImp implements ClazzBelongService {
	@Autowired
	private ClazzBelongRepo clazzrepo;

	@Override
	public ClazzBelong insertClazz(ClazzBelong clazz) {
		return clazzrepo.save(clazz);
	}

	@Override
	public ClazzBelong findClazzBelongById(Long id) {
		return clazzrepo.findClazzBelongById(id);
	}
}

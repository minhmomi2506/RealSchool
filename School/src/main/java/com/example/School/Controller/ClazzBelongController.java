package com.example.School.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.School.ClazzBelongService.ClazzBelongService;
import com.example.School.Entity.ClazzBelong;

@RestController
public class ClazzBelongController {
	@Autowired
	private ClazzBelongService clazzservice;

	/**
	 * INSERT CLAZZ STUDY
	 * @param clazzbelong
	 * @return
	 */
	@PostMapping("/insertClazzBelong")
	public ClazzBelong insert(@RequestBody ClazzBelong clazzbelong) {
		return clazzservice.insertClazz(clazzbelong);
	}
}

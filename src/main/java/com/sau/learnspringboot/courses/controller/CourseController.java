package com.sau.learnspringboot.courses.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sau.learnspringboot.courses.bean.Courses;

@RestController
public class CourseController {
	
	@GetMapping("/courses")
	public List<Courses> getAllCourses(){
		return List.of(new Courses(10,"sau the beautiful girl","sau"));
	}

}

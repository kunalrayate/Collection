package com.tka.controller;

import java.util.List;

import com.tka.Service.StudentService;
import com.tka.entity.Student;

public class StudentController {
	StudentService service = null;

	public List<Student> getAllstudentcontroller() {
		service = new StudentService();
		List<Student> db = service.getAllStudentservice();
		return db;
	}

	public List<Student> getAllstudentnamecontroller(String ch) {
		service = new StudentService();
		List<Student> db = service.getAllstudentnameservice(ch);
		return db;
	}
	public List<Student> getAllMaximummarkscontroller()
	{
		service = new StudentService();
		List<Student>db = service.getAllMaximummarks();
		return db;
	}
	public List<Student> getAllMinmummarkcontroller()
	{
		service = new StudentService();
		List<Student> db = service.getAllMinmummarks();
		return db;
	}
}

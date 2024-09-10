package com.tka.client;

import java.util.List;

import com.tka.controller.StudentController;
import com.tka.entity.Student;

public class Client {
	public static void main(String[] args) {
		StudentController sc = new StudentController();
		List<Student> db = sc.getAllstudentcontroller();
		System.out.println(db);

		List<Student> db1 = sc.getAllstudentnamecontroller("V");
		System.out.println(db1);

		List<Student> db2 = sc.getAllMaximummarkscontroller();
		System.out.println(db2);

		List<Student> db3 = sc.getAllMinmummarkcontroller();
		System.out.println(db3);
	}
}

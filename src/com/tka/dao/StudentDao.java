package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Student;

public class StudentDao {
	public List<Student> getAllstudents() {
		List<Student> db = new ArrayList<Student>();

		db.add(new Student(1, "Gabbar", 98));
		db.add(new Student(2, "Viru", 76));
		db.add(new Student(3, "Sham", 95));
		db.add(new Student(4, "Ram", 91));
		db.add(new Student(5, "Jay", 74));
		return db;

	}
}
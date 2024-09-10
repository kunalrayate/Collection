package com.Sep10;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
	public static void main(String[] args) {
		List<Student> m1 = new ArrayList<Student>();
		Student s1 = new Student(1, "kunal", 89);
		Student s2 = new Student(2, "kunal", 99);
		Student s3 = new Student(3, "kunal", 59);
		Student s4 = new Student(4, "kunal", 79);
		Student s5 = new Student(5, "kunal", 95);
		m1.add(s1);
		m1.add(s2);
		m1.add(s3);
		m1.add(s4);
		m1.add(s5);
		// System.out.println(m1);
		
		for(Student s : m1)
		{
			System.out.println(s.getMarks());
		}
	}

}

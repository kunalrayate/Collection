package com.Sep10;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		List<Integer> marks = new ArrayList<Integer>();
		int[] c = { 1, 2, 3 };
		marks.add(88);
		marks.add(89);
		// marks.add(c);
		marks.add(87);
		marks.add(96);
		marks.add(93);
		for (int i = 0; i < marks.size(); i++) {
			System.out.println(marks.get(i));
		}
		System.out.println(marks);
		// System.out.println(marks.size());
		
		for(int i:marks)
		{
			System.out.println(i);
		}
	}
}

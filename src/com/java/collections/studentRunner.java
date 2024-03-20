package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class studentRunner {

	public static void main(String[] args) {
		List<Student> student1 = List.of(new Student("vinay", 145), new Student("vamsi", 34), new Student("jack", 2));
		ArrayList<Student> Student = new ArrayList<>(student1);
		System.out.println(Student);
		Collections.sort(Student);
		System.out.println(Student);
	}

}

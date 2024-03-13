package com.java.array;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int marks[] = { 10, 29, 50, 45, 69, 98, 45 };
		Student student1 = new Student("vinay", 10, 29, 50, 45, 69, 98, 45, 999);

		int number = student1.getNoOfMarks();
		int sum = student1.getSumOfmarks();
		int max = student1.getMaximumMarks();
		int min = student1.getMinimumMarks();
		BigDecimal avf = student1.getAvgMarks();
		System.out.println(number);
		System.out.println(sum);
		System.out.println(max);
		System.out.println(min);
		System.out.println(avf);
//		student1.removeMark(65);
//		student1.addMarks(50);
		System.out.println(student1);

	}

}

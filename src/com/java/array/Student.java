package com.java.array;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		this.name = name;
		for (int mark : marks) {
			this.marks.add(mark);
		}

	}

	public int getNoOfMarks() {
		// TODO Auto-generated method stub

		return marks.size();
	}

	public int getSumOfmarks() {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMarks() {
		// TODO Auto-generated method stub
		return Collections.max(marks);
	}

	public int getMinimumMarks() {
		// TODO Auto-generated method stub
		return Collections.min(marks);

	}

	public BigDecimal getAvgMarks() {
		// TODO Auto-generated method stub
		BigDecimal bg1 = new BigDecimal(getSumOfmarks());
		BigDecimal bg2 = new BigDecimal(getNoOfMarks());

		BigDecimal avg = bg1.divide(bg2, 3, RoundingMode.UP);

		return avg;
	}

	public void removeMark(int i) {
		// TODO Auto-generated method stub
		System.out.println("before remove: " + marks);
		marks.remove(i);
		System.out.println("after remove : " + marks);

	}

	public void addMarks(int i) {
		// TODO Auto-generated method stub
		System.out.println("before add: " + marks);
		marks.add(i);
		System.out.println("after add : " + marks);

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

}

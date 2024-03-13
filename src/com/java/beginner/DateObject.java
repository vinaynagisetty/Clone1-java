package com.java.beginner;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateObject {
	public static void main(String[] args) {
		LocalDate a = LocalDate.now();
		System.out.println(a);
		LocalDateTime b = LocalDateTime.now();
		System.out.println(b);

	}
}

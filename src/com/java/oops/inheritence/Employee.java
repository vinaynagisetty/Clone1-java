package com.java.oops.inheritence;

public class Employee extends Person {
	private String title;
	private String employer;
	private Character grade;
	private long salary;

	public Employee(String name, String employer) {
		super(name);
		this.employer = employer;
		System.out.println("Employee constructor");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

//	public Employee() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	public String getEmployer() {
		return employer;
	}

	public void setEmployer(String employer) {
		this.employer = employer;
	}

	public Character getGrade() {
		return grade;
	}

	public void setGrade(Character grade) {
		this.grade = grade;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + " Employee [title=" + title + ", employer=" + employer + ", grade=" + grade
				+ ", salary=" + salary + "]";
	}

}

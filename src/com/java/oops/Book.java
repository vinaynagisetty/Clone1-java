package com.java.oops;

public class Book {
	private int noOfCopies;

	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;

	}

	Book(int noOfCopies, int b) {
		this.noOfCopies = noOfCopies;

	}

	void numOfPages() {
		System.out.println("100 pages");
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;
		}

	}

	public void increaseNoOfCopies(int howMany) {
		setNoOfCopies(this.noOfCopies + howMany);
	}

	public void decreaseNoOfCopies(int howMany) {
		setNoOfCopies(this.noOfCopies - howMany);
	}

}

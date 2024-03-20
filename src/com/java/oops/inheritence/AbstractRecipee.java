package com.java.oops.inheritence;

public abstract class AbstractRecipee {
	public void execute() {
		prepare();
		doDish();
		cleanUp();
	}

	public abstract void prepare();

	public abstract void doDish();

	public abstract void cleanUp();
}

package com.java.oops.level2;

public class Fan {
	private String make;
	private double radius;
	private String color;
	private byte speed;
	private boolean isOn;

	Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	public void isOn(boolean isOn) {
		this.isOn = isOn;

	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);

	}

	public void switchOn() {
		this.isOn = true;
		setSpeed((byte) 5);

	}

	public void setSpeed(byte speed) {
		this.speed = speed;

	}

	@Override
	public String toString() {
		return String.format("manufacturer-%s,radius-%f,color-%s,speed-%d,isOn-%b  ", make, radius, color, speed, isOn);
	}

}

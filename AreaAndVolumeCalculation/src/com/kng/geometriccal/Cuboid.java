package com.kng.geometriccal;

public class Cuboid extends Rectangle {

	private double height;
	public Cuboid() {
		height=15;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	

	public double computeArea(double length, double width, double height) {
		area=computeArea(length, width);
		area=area*height;
		this.height=height;
		return area;
		

	}
	
	@Override
	public void show() {
		System.out.println("Length of cuboid::"+getLength());
		System.out.println("Width of cuboid::"+getWidth());
		System.out.println("Height of cuboid::"+this.height);
		System.out.println("Area of Cuboid ::"+area);
	}
}

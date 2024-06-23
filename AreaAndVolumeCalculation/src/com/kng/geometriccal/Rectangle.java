package com.kng.geometriccal;

public class Rectangle extends GeometricShape {

	private double width;
	private double length;
	
	public Rectangle() {
		width=10;
		length=10;
	}

	//setter and getter method  
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	
	@Override
	public double computeArea(double length, double width) {
		area=length*width;
		this.length=length;
		this.width=width;
		return area;
	}
	
	@Override
	public void show() {
		
		System.out.println("Length of rectangle::"+this.length);
		System.out.println("Width of rectangle::"+this.width);
		System.out.println("Area of rectangle::"+area);
	}
	
}

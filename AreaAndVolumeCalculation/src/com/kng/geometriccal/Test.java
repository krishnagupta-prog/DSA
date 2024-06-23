package com.kng.geometriccal;

public class Test {

	public static void main(String[] args) {
		
		Rectangle r= new Rectangle();
		r.computeArea(70,30);
		r.show();
		Cuboid c= new Cuboid();
		c.computeArea(20, 50, 30);
		c.show();
	}
}

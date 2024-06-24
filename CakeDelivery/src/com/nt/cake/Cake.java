package com.nt.cake;

public abstract class Cake {

	private String shape;
	private String flavour;
	private int qty;
	private float price;
	//constructor
	protected Cake(String shape,String flavour,int qty) {
		this.shape=shape;
		this.flavour=flavour;
		this.qty=qty;
	}
	
	//method
	protected void showCake() {
		System.out.println("A "+this.getShape()+" "+this.getFlavour()+" Cake of "+this.getQty()+" Kg/Kg's ready with  @ "+this.getPrice()+"/-");
	}

	// setter and getter 
	protected String getShape() {
		return shape;
	}

	protected void setShape(String shape) {
		this.shape = shape;
	}

	protected String getFlavour() {
		return flavour;
	}

	protected void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	protected int getQty() {
		return qty;
	}

	protected void setQty(int qty) {
		this.qty = qty;
	}

	protected float getPrice() {
		return price;
	}

	protected void setPrice(float price) {
		this.price = price*qty;
	}
	
	
}

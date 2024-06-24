package com.nt.cake;

public class OrderedCake extends Cake {

	private String message;
	
	public OrderedCake() {
		super("Round","Vanilla",1);
		super.setPrice(200);
	}
	
	
	public OrderedCake(String shape, String flavour, int qty) {
		super(shape, flavour, qty);
	}

	
	
	public OrderedCake(String shape, String flavour, int qty, String message) {
		super(shape, flavour, qty);
		this.message = message;
	}


	@Override
	public void showCake() {
		try {
			if(message.equals(null))
				System.out.println("A "+super.getShape()+" "+super.getFlavour()+" Cake of "+super.getQty()+" Kg/Kg's ready with message "+this.message+" @ "+super.getPrice()+"/-");
			
		}
		catch (Exception e) {
			super.showCake();
			
		}
		}
}

package com.nt.cake;

public class Main {

	public static void main(String[] args) {
		
		OrderedCake oc = new OrderedCake("Round", "@Venilla",2, "Happy BirthDay ");
		
		
		oc.showCake();
		
		oc= new OrderedCake("Circle", "Chocklate", 1);
		oc.showCake();

	}

}

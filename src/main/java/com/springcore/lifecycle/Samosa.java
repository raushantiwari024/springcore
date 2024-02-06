package com.springcore.lifecycle;

public class Samosa{
	private double price;

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Samosa(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println("Setting price");
	}
	
	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init(){
		// TODO Auto-generated method stub
		System.out.println("Samosa Initiated");
		
	}

	public void destroy() {
		System.out.println("Samosa Destroyed......");
	}

	

}

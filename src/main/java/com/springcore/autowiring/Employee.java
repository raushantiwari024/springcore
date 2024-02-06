package com.springcore.autowiring;

public class Employee {
	private Address address;
	private Address address2;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Address address, Address address2) {
		super();
		this.address = address;
		this.address2 = address2;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + ", address2=" + address2 + "]";
	}

	
	
	
	

}

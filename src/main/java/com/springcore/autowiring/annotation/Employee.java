package com.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
	
	private Address address;
//	private Address address2;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
//		this.address2 = address2;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
}

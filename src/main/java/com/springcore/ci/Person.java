package com.springcore.ci;

public class Person {
	private String name;
	private String personId;
	private Certi certi;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String personId) {
		super();
		this.name = name;
		this.personId = personId;
		System.out.println("Constructor invoked..........");
	}
	
	public Person(String name, String personId,Certi certi) {
		super();
		this.name = name;
		this.personId = personId;
		this.certi=certi;
		System.out.println("Constructor invoked..........");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	
	public Certi getCerti() {
		return certi;
	}
	public void setCerti(Certi certi) {
		this.certi = certi;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", certi=" + certi + "]";
	}
	

}

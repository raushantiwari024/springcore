package com.springcore.ci;

public class Certi {
	private String certificate;

	public Certi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certi(String certificate) {
		super();
		this.certificate = certificate;
	}

	public String getCertificate() {
		return certificate;
	}

	public void setCertificate(String certificate) {
		this.certificate = certificate;
	}

	@Override
	public String toString() {
		return "Certi [certificate=" + certificate + "]";
	}
	
	

}

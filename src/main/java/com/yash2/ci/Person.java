package com.yash2.ci;

import java.security.cert.Certificate;

public class Person {
	private String name;
	private int personId;
	private Certifi   certi;
	public Person(String name,int personId,Certifi certi) {
		this.name=name;
		this.personId=personId;
		this.certi=certi;
		
	}
	@Override
	public String toString() {
		return this.name+"  :  "+this.personId+"{"+this.certi.name+ "}";
		
	}
	

}

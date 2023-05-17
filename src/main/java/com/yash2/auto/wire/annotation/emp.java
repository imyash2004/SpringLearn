package com.yash2.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class emp {
	
	private Address address;

	public Address getAddress() {
		return address;
	}
	@Autowired
	@Qualifier("tempaddress")
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("setter method");
	}

	public emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public emp(Address address) {
		super();
		this.address = address;
		System.out.println("constructr injection");
	}

	@Override
	public String toString() {
		return "emp [address=" + address + "]";
	}

}

package com.web.blosom.model;

import java.util.List;

public class Customer {
	
	private String customerId;
	
	private String customerName;
	
	private String adderss;
	
	private String phoneNumber;
	
	private List<Flowers> flowers;
	
	private String senderAddress;
	
	private String senderName;
	
	private boolean isRegisterd;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAdderss() {
		return adderss;
	}

	public void setAdderss(String adderss) {
		this.adderss = adderss;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Flowers> getFlowers() {
		return flowers;
	}

	public void setFlowers(List<Flowers> flowers) {
		this.flowers = flowers;
	}

	public String getSenderAddress() {
		return senderAddress;
	}

	public void setSenderAddress(String senderAddress) {
		this.senderAddress = senderAddress;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public boolean isRegisterd() {
		return isRegisterd;
	}

	public void setRegisterd(boolean isRegisterd) {
		this.isRegisterd = isRegisterd;
	}
}

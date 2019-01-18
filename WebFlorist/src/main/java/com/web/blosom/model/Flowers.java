package com.web.blosom.model;

import org.springframework.web.multipart.MultipartFile;

public class Flowers {
	
	private String flowerId;
	
	private String flowerName;
	
	private int noOfFlowers;
	
	private double costOfFlowers;
	
	private double discount;
	
	private MultipartFile imagePath;

	public String getFlowerId() {
		return flowerId;
	}

	public void setFlowerId(String flowerId) {
		this.flowerId = flowerId;
	}

	public String getFlowerName() {
		return flowerName;
	}

	public void setFlowerName(String flowerName) {
		this.flowerName = flowerName;
	}

	public int getNoOfFlowers() {
		return noOfFlowers;
	}

	public void setNoOfFlowers(int noOfFlowers) {
		this.noOfFlowers = noOfFlowers;
	}

	public double getCostOfFlowers() {
		return costOfFlowers;
	}

	public void setCostOfFlowers(double costOfFlowers) {
		this.costOfFlowers = costOfFlowers;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public MultipartFile getImagePath() {
		return imagePath;
	}

	public void setImagePath(MultipartFile imagePath) {
		this.imagePath = imagePath;
	}

}

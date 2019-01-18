package com.web.blosom.rest.model;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonPropertyOrder
public class FlowersWs {
	
private String flowerId;
	
	private String flowerName;
	
	private int noOfFlowers;
	
	private double costOfFlowers;
	
	private double discount;
	
	@JsonDeserialize(contentAs = CommonsMultipartFile.class)
	private MultipartFile image;

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

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}
	
}

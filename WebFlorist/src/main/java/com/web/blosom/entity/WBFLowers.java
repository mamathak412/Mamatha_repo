package com.web.blosom.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="FLOWERS")
public class WBFLowers implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="flowerId")
	@GeneratedValue(strategy= GenerationType.TABLE)
	private long flowerId;

	@Column(name="flowerName")
	private String flowerName;

	@Column(name="noOfFlowers")
	private int noOfFlowers;

	@Column(name="costOfFlowers")
	private double costOfFlowers;

	@Column(name="discount")
	private double discount;

	@Lob
	@Column(name="image")
	private byte[] image;
	
	public long getFlowerId() {
		return flowerId;
	}

	public void setFlowerId(long flowerId) {
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

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	
}

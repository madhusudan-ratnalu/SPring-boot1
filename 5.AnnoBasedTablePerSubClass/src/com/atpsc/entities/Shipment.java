package com.atpsc.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="shipment")
public class Shipment implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="awb_no")
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int awbNo;
	
	protected String source;
	protected String destination;
	protected float weight;
	protected double price;

	public int getAwbNo() {
		return awbNo;
	}

	public void setAwbNo(int awbNo) {
		this.awbNo = awbNo;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Shipment [awbNo=" + awbNo + ", source=" + source + ", destination=" + destination + ", weight=" + weight
				+ ", price=" + price + "]";
	}

}

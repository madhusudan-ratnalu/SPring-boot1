package com.atpsc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name="awb_no")
@Table(name = "speed_shipment")

public class SpeedShipment extends Shipment {
	private static final long serialVersionUID = 1L;
	
	
	@Column(name="days_to_deliver")
	protected int daysToDeliver;
	protected String instruction;

	public int getDaysToDeliver() {
		return daysToDeliver;
	}

	public void setDaysToDeliver(int daysToDeliver) {
		this.daysToDeliver = daysToDeliver;
	}

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	@Override
	public String toString() {
		return "SpeedShipment [daysToDeliver=" + daysToDeliver + ", instruction=" + instruction + ", awbNo=" + awbNo
				+ ", source=" + source + ", destination=" + destination + ", weight=" + weight + ", price=" + price
				+ "]";
	}

}

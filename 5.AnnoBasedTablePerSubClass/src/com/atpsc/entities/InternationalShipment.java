package com.atpsc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name="awb_no")
@Table(name="International_shipment")
public class InternationalShipment extends Shipment {
	private static final long serialVersionUID = 1L;

	@Column(name="shipment_mode")
	protected String shipmentMode;
	@Column(name = "tax_amount")
	protected double taxAmount;

	public String getShipmentMode() {
		return shipmentMode;
	}

	public void setShipmentMode(String shipmentMode) {
		this.shipmentMode = shipmentMode;
	}

	public double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	@Override
	public String toString() {
		return "InternationalShipment [shipmentMode=" + shipmentMode + ", taxAmount=" + taxAmount + ", awbNo=" + awbNo
				+ ", source=" + source + ", destination=" + destination + ", weight=" + weight + ", price=" + price
				+ "]";
	}

}

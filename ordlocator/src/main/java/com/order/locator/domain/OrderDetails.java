package com.order.locator.domain;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_DETAILS")
public class OrderDetails {
	@Id
	@GeneratedValue
	private int id;
	@Column(unique=true)
	private String orderId;
	private String productName;
	private String orderdBy;
	private String source;
	private String destination;
	private String deliverdBy;
	private ZonedDateTime lastUpdatedOn;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getOrderdBy() {
		return orderdBy;
	}
	public void setOrderdBy(String orderdBy) {
		this.orderdBy = orderdBy;
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
	public String getDeliverdBy() {
		return deliverdBy;
	}
	public void setDeliverdBy(String deliverdBy) {
		this.deliverdBy = deliverdBy;
	}
	public ZonedDateTime getLastUpdatedOn() {
		return lastUpdatedOn;
	}
	public void setLastUpdatedOn(ZonedDateTime lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}
}

package com.order.locator.domain;

import java.time.ZonedDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDLOCATION")
public class OrdLocation {
	@Id
	@GeneratedValue
	private Long id;
	private String orderId;
	private String lattitude;
	private String longitude;
	private ZonedDateTime lastupdatedon;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getLattitude() {
		return lattitude;
	}
	public void setLattitude(String lattitude) {
		this.lattitude = lattitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public ZonedDateTime getLastupdatedon() {
		return lastupdatedon;
	}
	public void setLastupdatedon(ZonedDateTime lastupdatedon) {
		this.lastupdatedon = lastupdatedon;
	}

}

package com.order.locator.service;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.locator.domain.OrdLocation;
import com.order.locator.domain.OrderDetails;
import com.order.locator.repository.OrdLocRepository;
import com.order.locator.repository.OrderDetailsRepository;

@Service
public class OrdLocService {

	@Autowired
	OrdLocRepository ordLocRepository;
	@Autowired
	OrderDetailsRepository orderDetailsRepository;

	public boolean saveLocationData(OrdLocation location) {
		try {
			location.setLastupdatedon(ZonedDateTime.now(ZoneId.ofOffset("GMT", ZoneOffset.of("+05:30"))));
			ordLocRepository.save(location);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public List<OrdLocation> getLocData(String orderId) {
		if (orderId != null && !orderId.isEmpty()) {
			return ordLocRepository.findAllByOrderId(orderId);
		} else {
			return ordLocRepository.findAll();
		}
	}
	
	public OrderDetails getOrderDetails(String orderId) {
		OrderDetails order = orderDetailsRepository.findByOrderId(orderId);
		
		if (order == null) {
			order = new OrderDetails();
			order.setOrderId(orderId);
			order.setProductName("iPhone X Space Gray, 64 GB");
			order.setSource("20.342585,85.804270");
			order.setDestination("20.342090,85.804546");
			order.setDeliverdBy("Subrat");
			order.setOrderdBy("Anubhab");
			order.setLastUpdatedOn(ZonedDateTime.now(ZoneId.ofOffset("GMT", ZoneOffset.of("+05:30"))));
			orderDetailsRepository.save(order);
		}
		
		return order;
	}
}

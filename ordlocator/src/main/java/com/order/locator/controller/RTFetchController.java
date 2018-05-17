package com.order.locator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.order.locator.service.RTFetchService;

@RestController
@CrossOrigin
public class RTFetchController {

	@Autowired
	RTFetchService rtFetchService;
	
	@RequestMapping("/getLiveCoords")
	public Object getLocData(@RequestParam("orderid") String orderId) throws Exception {
		//List<OrdLocation> response = null;
		//response = rtFetchService.getLiveCoords(orderId);
		return rtFetchService.getLiveCoords(orderId);
	}
}

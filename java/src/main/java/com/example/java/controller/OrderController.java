package com.example.java.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.java.entity.Order;
import com.example.java.service.OrderService;

import ch.qos.logback.core.model.Model;

@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	
	
}
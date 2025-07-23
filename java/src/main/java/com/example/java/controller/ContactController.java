package com.example.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.java.entity.Message;
import com.example.java.service.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@PostMapping("/send/message")
	public String sendMessage(Message message, Model model) {
		contactService.createMessage(message);
		model.addAttribute("confirmation", "Your message has been successfully sent!!");
		
		return "ContactUs";
	}

}
package com.techie.user_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techie.user_service.rabbitMq.Publisher;

@RestController
public class controller {

	private final MsgService service;
	
	@Autowired
	private Publisher publisher;

	 
	controller(MsgService service){
		this.service=service;
	}
	
	
	@GetMapping("/")
	public String get() {
		return service.show();
	}
	
	@GetMapping("/direct")
	public void direct() {
		publisher.messageDirect("Direct Message A");
	}
	
	@GetMapping("/fanout")
	public void fanout() {
		publisher.messageFanout("Fanout Message B");
	}
}

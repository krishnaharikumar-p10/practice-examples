package com.file.springboot_file.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	
	@Autowired
	private KafkaTemplate<String,String> template;
	
	public void sendKey(String key,String message) {
		template.send("test-topic",key,message);
		
	}
	
	public void sendWithoutKey(String message) {
		template.send("test-topic",null,message);
	}
	
}

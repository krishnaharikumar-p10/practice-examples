package com.file.springboot_file.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
	
	@KafkaListener(topics ="test-topic",groupId="test-group")
	public void consumer(ConsumerRecord<String,String> message) {
		
		System.out.println("partition:"+ message.partition()+
				"keys: "+ message.key()+
				"message: "+message.value());
	}

}

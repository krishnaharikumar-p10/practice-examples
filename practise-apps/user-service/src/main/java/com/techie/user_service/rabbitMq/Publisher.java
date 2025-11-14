package com.techie.user_service.rabbitMq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class Publisher {

	@Autowired
	RabbitTemplate template;
	
	public void messageDirect(String message) {
		template.convertAndSend(
				RabbitConfig.DIRECT_EXCHANGE,
				RabbitConfig.DIRECT_ROUTING_KEY,
				message);
		
	}
	
	public void messageFanout(String message) {
		template.convertAndSend(
				RabbitConfig.FANOUT_EXCHANGE,
				null,
				message);
	}

}
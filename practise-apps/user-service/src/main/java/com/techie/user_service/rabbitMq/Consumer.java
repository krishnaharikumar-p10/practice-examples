package com.techie.user_service.rabbitMq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @RabbitListener(queues = RabbitConfig.DIRECT_QUEUE)
    public void directListener(String message) {
        System.out.println("Direct Received: " + message);
    }
    
    
    @RabbitListener(queues= RabbitConfig.FANOUT_QUEUE_1)
    public void fanoutListener1(String message) {
    	System.out.println("Fanout Q1 Received : "+ message);
    }
    
    @RabbitListener(queues= RabbitConfig.FANOUT_QUEUE_2)
    public void fanoutListener2(String message) {
    	System.out.println("Fanout Q2 Received : "+ message);
    }
}


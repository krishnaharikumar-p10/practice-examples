package com.techie.user_service.rabbitMq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

	public  static final String DIRECT_QUEUE= "direct.queue";
	public static final String DIRECT_EXCHANGE="direct.exchange";
	public static final String DIRECT_ROUTING_KEY="direct.routing.key";
	
	public static final String FANOUT_QUEUE_1="fanout.queue1";
	public static final String FANOUT_QUEUE_2="fanout.queue2";
	public static final String FANOUT_EXCHANGE="fanout.exchange";
	
	
	@Bean
	public Queue directQueue() {
		return new Queue(DIRECT_QUEUE);
	}
	
	@Bean
	public DirectExchange directExchange() {
		return new DirectExchange(DIRECT_EXCHANGE);
		
	}
	
	@Bean
	public Binding directBinding() {
		return BindingBuilder.bind(directQueue())
				.to(directExchange())
				.with(DIRECT_ROUTING_KEY);
	}
	
	@Bean
	public Queue fanoutQueue1() {
		return new Queue(FANOUT_QUEUE_1);
	}
	
	@Bean
	public Queue fanoutQueue2() {
		return new Queue(FANOUT_QUEUE_2);
	}
	
	@Bean
	public FanoutExchange fanoutExchange() {
		return new FanoutExchange(FANOUT_EXCHANGE);
	}
	
	@Bean
	public Binding bindToQueue1() {
		return BindingBuilder.bind(fanoutQueue1())
				.to(fanoutExchange());
	}
	
	
	@Bean
	public Binding bindToQueue2() {
		return BindingBuilder.bind(fanoutQueue2())
				.to(fanoutExchange());
	}

	
}

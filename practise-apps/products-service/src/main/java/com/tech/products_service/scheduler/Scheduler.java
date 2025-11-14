package com.tech.products_service.scheduler;

import java.util.List;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.tech.products_service.dto.ProductResponse;
import com.tech.products_service.service.ProductService;
import lombok.RequiredArgsConstructor;


@Component
public class Scheduler {

	private final ProductService service;
	
	public Scheduler(ProductService service){
		this.service=service;
	}
	
	@Scheduled(cron="0 4 23 ? * MON-FRI")
	public void getProduct() {
	    service.getProduct().stream()
	    .forEach(p -> System.out.println(p.getId()));;
	}

}

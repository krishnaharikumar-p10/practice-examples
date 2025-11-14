package com.tech.products_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech.products_service.dto.ProductRequest;
import com.tech.products_service.dto.ProductResponse;
import com.tech.products_service.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/product")
public class ProductController {
	
	private final ProductService productservice;
	
	@PostMapping
	public void createProduct(@RequestBody ProductRequest productrequest) {
		productservice.createProduct(productrequest);
	}
	
	@GetMapping
	public List<ProductResponse> getProduct() {
		return productservice.getProduct();
	}
	
	
	
	
}

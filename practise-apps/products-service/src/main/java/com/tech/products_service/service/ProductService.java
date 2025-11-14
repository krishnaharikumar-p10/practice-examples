package com.tech.products_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tech.products_service.dto.ProductRequest;
import com.tech.products_service.dto.ProductResponse;
import com.tech.products_service.model.Product;
import com.tech.products_service.repository.ProductRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
	
	private final ProductRepository productrepository;

	public void createProduct(ProductRequest productrequest) {
		
		Product product= Product.builder()
				.id(productrequest.getId())
				.name(productrequest.getName())
				.description(productrequest.getDescription())
				.price(productrequest.getPrice())
				.build();
		
		productrepository.save(product);
		log.info("Product {} is created", product.getId());
					
	}

	public List<ProductResponse> getProduct() {
		
		List<Product> repository = productrepository.findAll();
		
		return repository.stream().map(product -> mapEntitytodto(product)).toList();
		
		
	}
	
	private ProductResponse mapEntitytodto(Product product) {
		
		ProductResponse productresponse= ProductResponse.builder()
				.id(product.getId())
				.name(product.getName())
				.description(product.getDescription())
				.price(product.getPrice())
				.build();
		return productresponse;
	}
	
}

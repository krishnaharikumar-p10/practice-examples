package com.file.springboot_file.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.file.springboot_file.model.Academic;


@FeignClient(name="academic-service" ,url="http://localhost:8082")
public interface AcademicClient {
	
	@GetMapping("/academic/{id}")
	Academic getDetailsbyId(@PathVariable("id") int id);
	

}

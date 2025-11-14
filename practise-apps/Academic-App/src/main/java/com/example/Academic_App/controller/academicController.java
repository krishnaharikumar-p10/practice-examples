package com.example.Academic_App.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Academic_App.model.Academic;
import com.example.Academic_App.service.academicService;

@RestController
@RequestMapping ("/academic")
public class academicController {

	@Autowired
	academicService service;
	
	@GetMapping("/getall")
	public List<Academic> getDetails() {
		return service.getDetails();
	}
	
	
	@GetMapping("/{id}")
	public Academic getDetailsbyId(@PathVariable int id) {
		return service.getDetailsbyId(id);
	}
	
	@PostMapping("/add")
	public void addDetails(@RequestBody Academic a) {
		service.addDetails(a);
	}
	
	@PutMapping("/update")
	public void updateDetails(@RequestBody Academic a) {
		service.updateDetails(a);
	}
	
	@DeleteMapping("/delete/{id}") 
		public void deleteDetails(@PathVariable int id) {
			service.deleteDetails(id);
		}
	
	
}

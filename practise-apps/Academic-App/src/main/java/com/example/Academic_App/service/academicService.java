package com.example.Academic_App.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Academic_App.model.Academic;
import com.example.Academic_App.repository.academicRepo;

@Service
public class academicService {
	
	@Autowired 
	academicRepo repo;

	
	public List<Academic> getDetails() {
		 List<Academic> acd = repo.findAll();
		 return acd;
	}
	
	public Academic getDetailsbyId(int id) {
		return repo.findById(id).orElseThrow(()-> new RuntimeException("No student with id" +id));
	}

	public void addDetails(Academic a) {
		
		repo.save(a);
		
	}

	public void updateDetails(Academic a) {
		repo.save(a);
	}

	public void deleteDetails(int id) {
		repo.deleteById(id);
		
	}
	
	
	
	

}

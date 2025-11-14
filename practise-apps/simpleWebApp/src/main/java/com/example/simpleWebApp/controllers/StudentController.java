package com.example.simpleWebApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.simpleWebApp.model.Student;
import com.example.simpleWebApp.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentservice;
	
	@GetMapping("/students")
	public List<Student> getStudent() {

		return  studentservice.getStudentDetails();
	}
	
	@GetMapping("/students/{studId}")
	public Student getStudentid(@PathVariable int studId) {

		return  studentservice.getStudentDetailsId(studId);
	}
	
	@PostMapping("/addstudent")
	public void addStudentDetails(@RequestBody Student s) {
		System.out.println(s);
		studentservice.addStudent(s);
	}
	
	@PutMapping("/updatestudent")
	public void updateStudentdata(@RequestBody Student st) {
		studentservice.updateStudent(st);
	}
	
	@DeleteMapping("/deletestudent/{id}")
	public void deleteStudentdata(@PathVariable int id) {
		studentservice.deleteStudent(id);
	}
}

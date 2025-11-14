package com.example.simpleWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.simpleWebApp.model.Student;

@Service
public class StudentService {
		
	
	List<Student> students = new ArrayList<>(Arrays.asList(
			new Student(100,"Taylor","taylor@gmail.com"),
			new Student(101,"Alex","alex@gmail.com"),
			new Student(102,"Nick","nick@gmail.com")));
	
	
	public List<Student> getStudentDetails(){
		
		return students;
		
	}

	public Student getStudentDetailsId(int studId) {
		
		Student studentdetail =students.stream()
		.filter(s-> s.getStudId()==studId)
		.findFirst().orElse(new Student (0,"No Name","No Email"));
		
		return studentdetail;
		
	}

	public void addStudent(Student s) {
		students.add(s);
		
	}
	
	public void updateStudent(Student st) {
		
		int index=0;
		for(int i =0 ; i< students.size();i++) 
			if (students.get(i).getStudId()==st.getStudId())
				index=i;
		
		students.set(index,st);
	}

	public void deleteStudent(int id) {
		int index=0;
		for(int i =0 ; i< students.size();i++) 
			if (students.get(i).getStudId()==id)
				index=i;
		
		students.remove(index);
		
	}

	
	
}	

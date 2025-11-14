package com.example.simpleWebApp.model;


public class Student {
	private int studId;
	private String studName;
	private String studEmail;
	
	public Student(int studId, String studName, String studEmail) {
		this.studId = studId;
		this.studName = studName;
		this.studEmail = studEmail;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudEmail() {
		return studEmail;
	}

	public void setStudEmail(String studEmail) {
		this.studEmail = studEmail;
	}
	
	public String toString() {
		return getStudId() + " : "  +getStudName() + " : " +getStudEmail();
		
	}
}

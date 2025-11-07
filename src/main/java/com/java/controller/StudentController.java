package com.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.java.entity.Student;
import com.java.service.StudentService;

@Controller
public class StudentController {
	
	
	@Autowired
	private StudentService service;
	public StudentService getService() {
		return service;
	}


	public void setService(StudentService service) {
		this.service = service;
	}


	public Student getSaveingStudentRecords(Student student) {
		
		
		Student student2=service.getInsertingValues(student);
		
		
		return student2;
		
	}
	
	
	public List<Student>getAllStudentRecords(){
		
		List<Student>all=service.getAllStudentRecords();
		
		return all;
	}

	
	public void getPrintSingleRecords(long id) {
		
		service.findSingleRecords(id);
		
	}
	
	public void getMutipleRecords(List<Student>students) {
		
		service.getInsertingMutipleRecords(students);
	}
	
	public void getdeletedBydiDStudentRecord(long id) {
		
		service.getdeletedById(id);
	}
	
	
	
	
	public void getdeletedAllRecords() {
		
		service.getdeleteAllRecords();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

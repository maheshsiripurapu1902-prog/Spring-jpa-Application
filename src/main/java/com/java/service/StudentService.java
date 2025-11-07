package com.java.service;

import java.util.List;

import com.java.entity.Student;

public interface StudentService {

	
	public Student getInsertingValues(Student student);
	
	public List<Student>getAllStudentRecords();
	
	public void findSingleRecords(long id);
	
	public void getInsertingMutipleRecords(List<Student>students);
	
	public void getdeletedById(long id);
	
	public void getdeleteAllRecords();
}

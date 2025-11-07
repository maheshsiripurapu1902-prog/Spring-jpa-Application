package com.java;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import com.java.controller.StudentController;
import com.java.entity.Student;

@SpringBootApplication
public class SpringJpaApplication  implements CommandLineRunner{
	
	@Autowired
	private StudentController controller;
	public StudentController getController() {
		return controller;
	}

	public void setController(StudentController controller) {
		this.controller = controller;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
		Student student=new Student();
		student.setName("zayn");
		student.setEmail("zayn@gmail.com");
		student.setPassword("zayn@123");
		student.setAddress("usA");
		
		Student student1=new Student();
		student1.setName("abhi");
		student1.setEmail("abhi@gmail.com");
		student1.setPassword("abhi@123");
		student1.setAddress("UK");
		
		Student student2=new Student();
		student2.setName("hello");
		student2.setEmail("world@gmail.com");
		student2.setPassword("world@123");
		student2.setAddress("zzz");
		
		
		ArrayList<Student>list=new ArrayList<>();
		
		list.add(student);
		list.add(student1);
		list.add(student2);
		
//		0.print multiple Records
		
//		controller.getMutipleRecords(list);
//		
		
//		1. save records
//	Student student2=controller.getSaveingStudentRecords(student);
	
//	System.out.println(student2);
		
		
//		2. find all records
		
//		List<Student>list=controller.getAllStudentRecords();
//		
//		list.forEach(student1->{
//			
//			System.out.println(student1);
//		});
//		
		
		
		
//		3. printing single Records 
		
//		controller.getPrintSingleRecords(2);
		
		
//		4. get delete by single Records
		
		
//		controller.getdeletedBydiDStudentRecord(2);
//		
		
		
		controller.getdeletedAllRecords();
		
		
		
		
	}

}

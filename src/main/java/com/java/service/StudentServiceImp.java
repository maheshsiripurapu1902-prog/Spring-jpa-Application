package com.java.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.entity.Student;
import com.java.repo.StudentRepo;

@Service
public class StudentServiceImp implements StudentService {
	
	@Autowired
	private StudentRepo repo;

	public StudentRepo getRepo() {
		return repo;
	}

	public void setRepo(StudentRepo repo) {
		this.repo = repo;
	}

	@Override
	public Student getInsertingValues(Student student) {
		
		
		
		Student student2=repo.save(student);
		return student2;
	}

	@Override
	public List<Student> getAllStudentRecords() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void findSingleRecords(long id) {
		// TODO Auto-generated method stub
		
		Optional<Student>op=repo.findById(id);
		
		System.out.println(op);
		
	}

	@Override
	public void getInsertingMutipleRecords(List<Student> students) {

		
		Iterable<Student>it=repo.saveAll(students);
		it.forEach(student->{
			System.out.println(student);
		});
		
	}

	@Override
	public void getdeletedById(long id) {

		repo.deleteById(id);
	}

	@Override
	public void getdeleteAllRecords() {
		
		List<Student>list=repo.findAll();
		
		repo.deleteAll(list);
		
	}
	

}

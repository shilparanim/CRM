package com.demo;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.entities.Student;
import com.demo.repository.StudentRepository;

@SpringBootTest
class CruddemoApplicationTests {
	
	@Autowired
	private StudentRepository StudentRepo;

	@Test
	void saveOneStudent() {
		Student s = new Student();
		s.setName("rak");
	    s.setSourse("java");
		s.setFee(80000);
		StudentRepo.save(s);
		}
	
	@Test
	void deleteoneStudent() {
		StudentRepo.deleteById(5L);
	}
	
	@Test
	void getOnestudent() {
		Optional<Student> findById = StudentRepo.findById(6L);
		Student student = findById.get();
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getSourse());
		System.out.println(student.getFee());
	}
@Test	
void UpdateStudent() {
	Student s=new Student();
	s.setId(6);
	s.setName("rak");
    s.setSourse("java");
	s.setFee(70000);
	StudentRepo.save(s);
	
}
}

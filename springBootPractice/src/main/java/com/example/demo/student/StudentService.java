package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	public List<Student> getStudents() {
		return List.of(new Student(1L,"Bivek","bivek@gmail.com",LocalDate.of(2000, Month.FEBRUARY, 28), 21));
	}
	public ResponseEntity<Student> getStudentHandler(Long roll){
		Student student = new Student(roll,"Bivek","bivek@gmail.com",LocalDate.of(2000, Month.FEBRUARY, 28), 21);
		ResponseEntity<Student> re = new ResponseEntity<>(student,HttpStatus.CREATED);
		return re;
	}
}

package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/student")
public class StudentController {
	
	@Autowired
	private final StudentService studentService;
	
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	@GetMapping
	public List<Student> getStudents() {
		return studentService.getStudents();
	}
	
	@PostMapping("/{n}")
	public ResponseEntity<Student> getResponseEntity(@PathVariable Long n){
		return studentService.getStudentHandler(n);
	}
	
	@GetMapping("/hello")
	public ResponseEntity<String> getReEntity(){
		return new ResponseEntity<String>("Hello",HttpStatus.OK);
	}
	@GetMapping("/getStudent/{roll}")
	public Student getStudentDetails(@PathVariable Long roll) {
		if(roll < 100)
			throw new IllegalArgumentException("Roll number should be greater than 100");
		return new Student(roll,"Bivek","bivek@gmail.com",LocalDate.of(2000, Month.FEBRUARY, 28), 21);
	}

	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<String> myExpHandler(IllegalArgumentException ie) {
		System.out.println("inside myHandler method...");
		return new ResponseEntity<String>(ie.getMessage(),HttpStatus.BAD_REQUEST);
	}
}

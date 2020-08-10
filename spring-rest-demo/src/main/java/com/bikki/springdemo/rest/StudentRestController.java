package com.bikki.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bikki.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	@GetMapping("/students")
	public List<Student> getStudents() {

		List<Student> theStudents = new ArrayList<>();

		theStudents.add(new Student("Bikki", "Mahato"));
		theStudents.add(new Student("John", "Cena"));
		theStudents.add(new Student("Hayden", "Jack"));

		return theStudents;
	}
}

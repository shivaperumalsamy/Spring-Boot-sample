package com.sirius.firstwebmaven.firstmavenweb.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sirius.firstwebmaven.firstmavenweb.entity.Student;
import com.sirius.firstwebmaven.firstmavenweb.services.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping(method = RequestMethod.GET)
	public Collection<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") int id) {
		return studentService.getStudentById(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public String deleteStudentById(@PathVariable("id") int id) {
		return studentService.deleteStudentById(id);
	}
	
	@RequestMapping( method = RequestMethod.PUT, consumes=MediaType.APPLICATION_JSON_VALUE)
	public Student updateStudent(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}
	
	@RequestMapping( method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String insertStudent(@RequestBody Student student) {
		return studentService.insertStudent(student);
	}
}

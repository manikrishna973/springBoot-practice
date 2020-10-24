package com.mani.springBootpractice.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mani.springBootpractice.entity.Student;
import com.mani.springBootpractice.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@RequestMapping(method = RequestMethod.GET)
	public Collection<Student> getAllStudents() {
		return this.studentService.getAllStudents();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Student getStudentById(@PathVariable("id") int id) {
		return studentService.getStudentById(id);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudentById(@PathVariable("id") int id){
        studentService.removeStudentById(id);
    }
	
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateStudent(@RequestBody Student student) {
		this.studentService.updateStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertStudent(@RequestBody Student student) {
		this.studentService.insertStudent(student);
	}
	
	
}

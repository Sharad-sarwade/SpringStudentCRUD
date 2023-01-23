package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.sarvice.StudentServiceImpl;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentServiceImpl studentServiceImpl;
	
	@GetMapping("/all")
	public List<Student> getAllData(Student student){
		List<Student> slist = studentServiceImpl.getAllData();
		return slist;
	}
	@GetMapping("/get {id}")
	public Student getStudent(@PathVariable("{id}") int id) {
		Student getstudent = studentServiceImpl.getStudentById(id);
		return getstudent;
	}
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student) {
		Student savestudent = studentServiceImpl.saveStudent(student);
		return savestudent;
	}
	@DeleteMapping("/delete {id}")
	public String deletStudent(@PathVariable("{id}") int id) {
		studentServiceImpl.deleteStudent(id);
		return "Record deleted..!";
	}
	@PutMapping("/update")
	public Student updateStudent(Student student) {
		Student updateStudent = studentServiceImpl.updateStudent(student);
		return updateStudent;
		
	}
}

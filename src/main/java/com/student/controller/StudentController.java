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
	@GetMapping("/get/{id}") //1
	public Student getIdData(@PathVariable("id") int id)
	{
		Student sonestd= studentServiceImpl.getIdData(id);
		 return sonestd;
	}
	
	@PostMapping("/save")
	public Student saveEmployee(@RequestBody Student student)
	{
		Student savedEmployee= studentServiceImpl.saveStudent(student);
		 return savedEmployee;
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteEmployeeById(@PathVariable("id") int id)
	{
		studentServiceImpl.deleteStudent(id);
		System.out.println("Student of "+id+" is deleted ....");
	}
	
	@PutMapping("/update/{id}")
	public Student updateStudent(@RequestBody Student student, @PathVariable("id") int id)
	{	
		student.setId(id);
		studentServiceImpl.updateStudent(student);
		return student;
	}
	
}

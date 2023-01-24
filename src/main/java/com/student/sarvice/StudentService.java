package com.student.sarvice;

import java.util.List;

import com.student.model.Student;

public interface StudentService {
	
		public List<Student> getAllData();
		
		public Student getIdData(int id);
		public Student saveStudent(Student student);
		public void deleteStudent(int id);
		public void updateStudent(Student student);
		
	
}

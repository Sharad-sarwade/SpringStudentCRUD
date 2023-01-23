package com.student.sarvice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDao;
import com.student.model.Student;
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentDao studentDao;
	@Override
	public List<Student> getAllData() {
		List<Student> slist = new ArrayList();
		studentDao.findAll().forEach(std ->slist.add(std));
		return slist;
	}
	@Override
	public Student getStudentById(int id) {
		Student student = studentDao.findById(id).get();
		return student;
	}
	@Override
	public Student saveStudent(Student student) {
		Student saveStudent = studentDao.save(student);
		return saveStudent;
	}
	@Override
	public void deleteStudent(int id) {
		studentDao.deleteById(id);
	}
	@Override
	public Student updateStudent(Student student) {
		return studentDao.save(student);
		
	}
	

}

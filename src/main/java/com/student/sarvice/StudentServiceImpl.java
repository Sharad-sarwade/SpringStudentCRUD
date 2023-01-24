package com.student.sarvice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDao;
import com.student.model.Student;
@Service
public  class StudentServiceImpl implements StudentService{
	List<Student> slist;
	@Autowired
	StudentDao studentDao;
	@Override
	public List<Student> getAllData() {
		slist = new ArrayList<Student>();
		studentDao.findAll().forEach(std ->slist.add(std));
		return slist;
	}
	@Override
	public Student getIdData(int id) {
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
	
	// update data
	@Override
	public void updateStudent(Student student) {
		
		
		studentDao.save(student);
	}
	

}

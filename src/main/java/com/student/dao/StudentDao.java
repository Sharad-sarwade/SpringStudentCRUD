package com.student.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.model.Student;
@Repository
public interface StudentDao extends CrudRepository<Student, Integer> {

}

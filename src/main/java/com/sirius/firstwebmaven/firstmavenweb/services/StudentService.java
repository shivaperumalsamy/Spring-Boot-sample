package com.sirius.firstwebmaven.firstmavenweb.services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sirius.firstwebmaven.firstmavenweb.dao.StudentDao;
import com.sirius.firstwebmaven.firstmavenweb.entity.Student;

@Service
public class StudentService {

	@Autowired
	@Qualifier("sampleData")
	private StudentDao studentDao;

	public Collection<Student> getAllStudents() {
		return this.studentDao.getAllStudents();
	}

	public Student getStudentById(int id) {
		return this.studentDao.getStudentById(id);
	}

	public String deleteStudentById(int id) {
		return this.studentDao.deleteStudentById(id);

	}

	public Student updateStudent(Student student) {
		return this.studentDao.updateStudent(student);
	}
	
	public String insertStudent(Student student) {
		return this.studentDao.insertSudent(student);
	}

}

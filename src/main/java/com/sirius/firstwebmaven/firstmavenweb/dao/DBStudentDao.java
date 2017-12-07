package com.sirius.firstwebmaven.firstmavenweb.dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.sirius.firstwebmaven.firstmavenweb.entity.Student;

@Repository
@Qualifier("dbData")
public class DBStudentDao implements StudentDao {

	
	@Override
	public Collection<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudentById(int id) {
		// TODO Auto-generated method stub
		return "From DB Data";
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String insertSudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

}

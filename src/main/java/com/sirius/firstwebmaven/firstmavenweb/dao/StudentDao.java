package com.sirius.firstwebmaven.firstmavenweb.dao;

import java.util.Collection;

import com.sirius.firstwebmaven.firstmavenweb.entity.Student;


public interface StudentDao {

	Collection<Student> getAllStudents();

	Student getStudentById(int id);

	String deleteStudentById(int id);

	Student updateStudent(Student student);

	String insertSudent(Student student);

}
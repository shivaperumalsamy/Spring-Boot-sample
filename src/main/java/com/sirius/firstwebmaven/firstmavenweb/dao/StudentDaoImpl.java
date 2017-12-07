package com.sirius.firstwebmaven.firstmavenweb.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.sirius.firstwebmaven.firstmavenweb.entity.Student;

@Repository
@Qualifier("sampleData")
public class StudentDaoImpl implements StudentDao {
	
	private static Map<Integer, Student> students;
	static {
		students = new HashMap<Integer, Student>() {
			{
				put(1, new Student(1, "AA", "Course1"));
				put(2, new Student(2, "BB", "Course2"));
				put(3, new Student(3, "CC", "Course3"));

			}
		};
	}

	/* (non-Javadoc)
	 * @see com.sirius.firstwebmaven.firstmavenweb.dao.StudentDao#getAllStudents()
	 */
	@Override
	public Collection<Student> getAllStudents() {
		return this.students.values();
	}

	/* (non-Javadoc)
	 * @see com.sirius.firstwebmaven.firstmavenweb.dao.StudentDao#getStudentById(int)
	 */
	@Override
	public Student getStudentById(int id) {
		return this.students.get(id);
	}

	/* (non-Javadoc)
	 * @see com.sirius.firstwebmaven.firstmavenweb.dao.StudentDao#deleteStudentById(int)
	 */
	@Override
	public String deleteStudentById(int id) {
		this.students.remove(id);
		return "Deleted Success";
	}

	/* (non-Javadoc)
	 * @see com.sirius.firstwebmaven.firstmavenweb.dao.StudentDao#updateStudent(com.sirius.firstwebmaven.firstmavenweb.entity.Student)
	 */
	@Override
	public Student updateStudent(Student student) {
		Student stu = this.students.get(student.getId());
		stu.setName(student.getName());
		stu.setCourse(student.getCourse());
		this.students.put(student.getId(), stu);
		return stu;
	}
	/* (non-Javadoc)
	 * @see com.sirius.firstwebmaven.firstmavenweb.dao.StudentDao#insertSudent(com.sirius.firstwebmaven.firstmavenweb.entity.Student)
	 */
	@Override
	public String insertSudent(Student student) {
		this.students.put(students.size()+1, student);
		return "Success";
	}
}

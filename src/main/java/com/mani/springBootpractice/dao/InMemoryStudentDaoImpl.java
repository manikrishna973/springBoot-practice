package com.mani.springBootpractice.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.mani.springBootpractice.entity.Student;
@Repository
@Qualifier("fakeData")
public class InMemoryStudentDaoImpl implements StudentDao {

	private static Map<Integer, Student> students;

	// static block used to initialize static variables
	// static block gets executed when the class is loaded into memory
	static {
		students = new HashMap<Integer, Student>() {
			

			{
				put(1, new Student(1, "Mani", "Computer Science"));
				put(2, new Student(2, "Alex", "Computer Science"));
				put(3, new Student(3, "Alba", "Computer Science"));
			}

		};
	}

	@Override
	public Collection<Student> getAllStudents() {
		return this.students.values();
	}
	
	@Override
	public Student getStudentById(int id) {
		return this.students.get(id);
	}
	
	
	@Override
	public void updateStudent(Student student) {
		Student s = students.get(student.getId());
		s.setCourse(student.getCourse());
		s.setName(student.getName());
		this.students.put(student.getId(), s);
	}

	@Override
	public void removeStudentById(int id) {
		this.students.remove(id);
	}

	@Override
	public void insertStudent(Student student) {
		this.students.put(student.getId(), student);
	}
}

package com.mani.springBootpractice.dao;

import java.util.Collection;

import com.mani.springBootpractice.entity.Student;

public interface StudentDao {

	Collection<Student> getAllStudents();

	Student getStudentById(int id);

	void updateStudent(Student student);

	void removeStudentById(int id);

	void insertStudent(Student student);

}
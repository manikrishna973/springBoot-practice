package com.mani.springBootpractice.dao;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mani.springBootpractice.entity.Student;
@Service
@Qualifier("mongoData")
public class MongoStudentDaoImpl implements StudentDao {

	@Override
	public Collection<Student> getAllStudents() {
		return new ArrayList<Student>() {
			{
				add(new Student(1,"Tara","Computer Science"));
				add(new Student(2, "Alba", "Java Script"));
			}
		};
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeStudentById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertStudent(Student student) {
		// TODO Auto-generated method stub

	}

}

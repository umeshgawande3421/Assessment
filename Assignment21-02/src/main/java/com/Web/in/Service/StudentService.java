package com.Web.in.Service;

import java.util.List;

import com.Web.in.Entity.Student;


public interface StudentService {
	

		public List<Student> listStudents(Student student);
		public Student saveStudent(Student student);
		public Student updateStudent(Student student);
		public String deleteStudent(Student student);
	}



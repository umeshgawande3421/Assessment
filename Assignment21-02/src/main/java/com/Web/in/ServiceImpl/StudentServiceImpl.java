package com.Web.in.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Web.in.Entity.Student;
import com.Web.in.Entity.repository.StudentRepository;
import com.Web.in.Service.StudentService;



@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository repository;

	@Override
	public List<Student> listStudents(Student student) {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return repository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return repository.save(student);
	}

	@Override
	public String deleteStudent(Student student) {
		// TODO Auto-generated method stub
	  repository.delete(student);
	  return "deleted successfully..";
	}
	
	
}
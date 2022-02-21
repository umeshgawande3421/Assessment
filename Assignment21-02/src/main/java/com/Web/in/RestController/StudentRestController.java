package com.Web.in.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Web.in.Entity.Student;
import com.Web.in.ServiceImpl.StudentServiceImpl;


@RestController
public class StudentRestController {
	@Autowired
	private StudentServiceImpl serviceImpl;
	
	@GetMapping("/")
	public List<Student> getAllStudents()
	{
		return serviceImpl.listStudents(null);
	}
	
	@PostMapping("/")
	public Student saveStudent(@RequestBody Student student)
	{
		return serviceImpl.saveStudent(student);
	}
	
	@PutMapping("/")
	public Student updateStudent(@RequestBody Student student)
	{
		return serviceImpl.saveStudent(student);
	}
	
	@DeleteMapping("/")
	public String deleteStudent(@RequestBody Student student)
	{
		serviceImpl.deleteStudent(student);
		return "delete done";
	}

}

package com.Web.in.Entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Web.in.Entity.Student;



@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}

package com.inet.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import com.inet.model.Person;
import com.inet.model.Student;

public interface PersonRepository extends JpaRepository<Person, String> {

	List<Person> findAllById(Student student);

	

}

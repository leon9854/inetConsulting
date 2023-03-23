package com.inet.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inet.model.Person;
import com.inet.model.Student;
import com.inet.model.Worker;
import com.inet.service.PersonService;

@RestController
@RequestMapping("/inetConsulting")
public class ControllerPerson {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping("/persons/{idPerson}")
	public Optional<Person> getPersonById(@PathVariable String idPerson){
		return personService.getPersonById(idPerson);
	}
	
	@GetMapping("listpersons")
	public List<Person> getAllPerson(){
		return personService.getALL();
	}
	
	
	  @GetMapping("persons/{student}") public List<Person>
	  getAllStudent(@PathVariable Student student){ return
	  personService.getAllStudence(student); }
	 
	@PostMapping("/addstudent")
	public void addStudent(@RequestBody Student student) {
		personService.addStudent(student);
	}
	
	@PostMapping("/addworker")
	public void addWorker(@RequestBody Worker worker) {
		personService.addWorker(worker);
	}

}

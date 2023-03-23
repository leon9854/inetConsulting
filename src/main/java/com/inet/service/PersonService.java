package com.inet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inet.dao.PersonRepository;
import com.inet.model.Person;
import com.inet.model.Student;
import com.inet.model.Worker;

@Service
public class PersonService {
	
	@Autowired
	PersonRepository personRepository;

	
	//recuper une personne a parti de son identifiant
	public Optional<Person> getPersonById(String idPerson){
		return personRepository.findById(idPerson);
	}
	
	//recuper toutes les personnes present dans la bb
	public List<Person> getALL(){
		return personRepository.findAll();
	}
	
	
	  //recuper la liste des personnes de type students public List<Person>
	  public List<Person> getAllStudence(Student student){
		  return personRepository.findAllById(student);
	  }
	 
	
	
	//recuper la liste des personnes de type worker
	public List<Person> getAllWorker(Worker student){
		return personRepository.findAll();
	}
	
	//suprimer la liste de toutes les personnes dans la bd
	public void deleteAllPerson() {
		personRepository.deleteAll();
	}
	
	//suprimer une personne a parti de son id 
	public void deleteById(String idperson) {
		personRepository.deleteById(idperson);
	}
	
	//ajouter un student dans la base de donnee 
	public void addStudent(Student student) {
		Person savestudent =personRepository.save(student);
	}
	
	//ajouter un student dans la base de donnee 
		public void addWorker(Worker worker) {
			Person saveWorker =personRepository.save(worker);
		}

		public List<Person> getAllStudent(Student student) {
			// TODO Auto-generated method stub
			return null;
		}


}

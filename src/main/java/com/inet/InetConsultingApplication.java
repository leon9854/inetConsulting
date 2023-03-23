package com.inet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.inet.dao.PersonRepository;
import com.inet.model.Person;
import com.inet.model.Student;
import com.inet.model.Worker;

@SpringBootApplication
public class InetConsultingApplication  {
	@Autowired
	private PersonRepository personRespository;

	public static void main(String[] args) {
		SpringApplication.run(InetConsultingApplication.class, args);
	}	
		
}

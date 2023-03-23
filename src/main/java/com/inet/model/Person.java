package com.inet.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_PERSON",discriminatorType=DiscriminatorType.STRING,length = 10)
public abstract class Person implements Serializable {
	@Id
	private String idPerson;
	private String namePerson;
	private int agePerson;
	public Person() {
		super();
	}
	public Person(String idPerson, String namePerson, int agePerson) {
		super();
		this.idPerson = idPerson;
		this.namePerson = namePerson;
		this.agePerson = agePerson;
	}
	public String getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(String idPerson) {
		this.idPerson = idPerson;
	}
	public String getNamePerson() {
		return namePerson;
	}
	public void setNamePerson(String namePerson) {
		this.namePerson = namePerson;
	}
	public int getAgePerson() {
		return agePerson;
	}
	public void setAgePerson(int agePerson) {
		this.agePerson = agePerson;
	}
	
}

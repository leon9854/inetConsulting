package com.inet.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("student")
public class Student extends Person {
	private String schoolName;
	private String classLevel;
	public Student(String idPerson, String namePerson, int agePerson, String schoolName, String classLevel) {
		super(idPerson, namePerson, agePerson);
		this.schoolName = schoolName;
		this.classLevel = classLevel;
	}
	public Student() {
		super();
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getClassLevel() {
		return classLevel;
	}
	public void setClassLevel(String classLevel) {
		this.classLevel = classLevel;
	}
	

}

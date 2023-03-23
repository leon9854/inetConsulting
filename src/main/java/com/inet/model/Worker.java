package com.inet.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("worker")
public class Worker extends Person {
	private String jobTitle;
	private String workPlace;
	public Worker(String idPerson, String namePerson, int agePerson, String jobTitle, String workPlace) {
		super(idPerson, namePerson, agePerson);
		this.jobTitle = jobTitle;
		this.workPlace = workPlace;
	}
	public Worker() {
		super();
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getWorkPlace() {
		return workPlace;
	}
	public void setWorkPlace(String workPlace) {
		this.workPlace = workPlace;
	}
	

}

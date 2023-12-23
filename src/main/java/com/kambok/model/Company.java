package com.kambok.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

@Entity
@Table(name="mycompany")
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String headquarter;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHeadquarter() {
		return headquarter;
	}
	public void setHeadquarter(String headquarter) {
		this.headquarter = headquarter;
	}
	public Company() {
		super();
	}
	public Company(int id, String name, String headquarter) {
		super();
		this.id = id;
		this.name = name;
		this.headquarter = headquarter;
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", headquarter=" + headquarter + "]";
	}
	
}

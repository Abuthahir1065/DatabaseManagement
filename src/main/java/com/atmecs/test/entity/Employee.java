package com.atmecs.test.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="employeeid")
private int employeeid;
@Column(name="name")
private String name;
@Column(name="email")
private String email;

public Employee() {
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public Employee(String name, String email) {
	super();
	this.name = name;
	this.email = email;
}


@Override
public String toString() {
	return "Employee [employeeid=" + employeeid + ", name=" + name + ", email=" + email + "]";
}



}

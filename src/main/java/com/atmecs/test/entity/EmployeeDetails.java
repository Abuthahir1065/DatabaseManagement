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
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employeedetails")
public class EmployeeDetails {
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
@Column(name="projectid")
private int projectId;
@Column(name="projectname")
private String projectname;

@Column(name="role")
private String role;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="employeeid")
private Employee employee;

public EmployeeDetails()
{
	
}

public int getProjectId() {
	return projectId;
}

public void setProjectId(int projectId) {
	this.projectId = projectId;
}

public String getProjectname() {
	return projectname;
}

public void setProjectname(String projectname) {
	this.projectname = projectname;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

public Employee getEmployee() {
	return employee;
}

public void setEmployee(Employee employee) {
	this.employee = employee;
}

public EmployeeDetails(String projectname, String role, Employee employee) {
	super();
	this.projectname = projectname;
	this.role = role;
	this.employee = employee;
}

@Override
public String toString() {
	return "EmployeeDetails [projectId=" + projectId + ", projectname=" + projectname + ", role=" + role + ", employee="
			+ employee + "]";
}





}

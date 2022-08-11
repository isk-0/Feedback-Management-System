package com.capg.FMS.entities;
import com.capg.FMS.entities.*;
import javax.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int employeeId;
	@Column(name = "Employee_Name",nullable=false)
	private String empName;
	@Column(name = "Password",nullable=false)
	private String password;
	@Column(name = "Location",nullable=false)
	private String location;
	//@Enumerated(EnumType.STRING)
	//private Role role;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	/*
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	*/
}

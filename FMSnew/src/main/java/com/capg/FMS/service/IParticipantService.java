
package com.capg.FMS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.capg.FMS.entities.Course;
import com.capg.FMS.entities.Employee;

@Service
public interface IParticipantService {

	public Employee addEmployee(Employee emp);
	public List<Employee> viewEmployeeList();
	public Employee enrollParticipant(Employee emp,Course course);
	public List<Employee> viewParticipantList(Course id);
	public String deleteEmployee(int employeeId); 
	public Optional<Employee> findById(int empid);

}

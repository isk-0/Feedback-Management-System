package com.capg.FMS.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.FMS.entities.Course;
import com.capg.FMS.entities.Employee;
import com.capg.FMS.repository.IParticipantRepository;

@Service
public class ParticipantServiceImpl implements IParticipantService{
	
	@Autowired
	IParticipantRepository participantrepo;

	@Override
	public Employee enrollParticipant(Employee emp, Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> viewParticipantList(Course id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return participantrepo.save(emp);
	}

	@Override
	public List<Employee> viewEmployeeList() {
		// TODO Auto-generated method stub
		return (List<Employee>) participantrepo.findAll();
	}

	@Override
	public String deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		 participantrepo.deleteById(employeeId);
		 return "Employee entry Deleted Successfully";
	}

	@Override
	public Optional<Employee> findById(int empid) {
		// TODO Auto-generated method stub
		return participantrepo.findById(empid);
	}

}

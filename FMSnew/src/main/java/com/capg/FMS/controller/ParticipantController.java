package com.capg.FMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.FMS.entities.Course;
import com.capg.FMS.entities.Employee;
import com.capg.FMS.service.ParticipantServiceImpl;
import java.util.List;
//import antlr.collections.List;
import java.util.Optional;

@RestController
public class ParticipantController {
	
	@Autowired
	private ParticipantServiceImpl participantservice;
	
	@PostMapping("/AddEmployee")
	public  Employee addEmployee(@RequestBody Employee emp) {
		
		return participantservice.addEmployee(emp);
 }
	
	@GetMapping("/ViewEmployeeList")
	public List<Employee> viewEmployeeList(){
		// TODO Auto-generated method stub
		return participantservice.viewEmployeeList();
	}
		
	@DeleteMapping(value="/DeleteEmployee/{eid}")
	public String deleteEmployee(@PathVariable Integer eid) {
		// TODO Auto-generated method stub
		return participantservice.deleteEmployee(eid);
	}	
	@GetMapping("/ViewEmployeeById/{eid}")
	public Optional<Employee> findById(@PathVariable int eid){
		return participantservice.findById(eid);
	}

}


package com.example.demo.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;

@RestController //@Controller+@ResponsBody= @RestController
// this is making our java class as a controller so it is  we can uses either @Controller or @RestController
//Also we can use @ResponsBody which uses http msg converters to convert value to http response body
@CrossOrigin(origins = "http://localhost:4200")//for the CORS issue we are using it 
@RequestMapping("/api/v1")//

public class EmployeeController<employee> {

	@Autowired// we are doing DI 
	private EmployeeRepo EmployeeRepo;

	// getting list of employees
	@GetMapping("/employees")//when we are getting the data 
	public List<Employee> getAllEmplyoees(){
		return EmployeeRepo.findAll();
	}

	//now we are posting more data
	
	@PostMapping(value = "/employees", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)//when we are posting the data
	public Employee createEmployee(@RequestBody Employee employee) {
		return EmployeeRepo.save(employee);
	}

	//get the employee by ID rest API
	@GetMapping("/employees/{id}")
	public ResponseEntity <Employee> getEmployeeById(@PathVariable Long id) {

		Employee employee=	EmployeeRepo.findById(id).orElseThrow
				(()-> new ResourceNotFoundException("Employee not exist with the Id: "+ id));
		return ResponseEntity.ok(employee);
	}

	//update the employee data
	@PutMapping("/employees/{id}")
	public ResponseEntity <Employee> updateEmployee(@PathVariable Long id,@RequestBody Employee employeeDetail) {
		Employee employee=	EmployeeRepo.findById(id).orElseThrow
				(()-> new ResourceNotFoundException("Employee not exist with the Id: "+ id));
		
		employee.setFirstName(employeeDetail.getFirstName());
		employee.setLastName(employeeDetail.getLastName());
		employee.setEmailId(employeeDetail.getEmailId()); 

		Employee updateEmployee=EmployeeRepo.save(employee);
		return ResponseEntity.ok(updateEmployee);

	}
	//delete employee rest api
	@DeleteMapping("/employees/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
		Employee employee=	EmployeeRepo.findById(id).orElseThrow
				(()-> new ResourceNotFoundException("Employee not exist with the Id: "+ id));
		
		EmployeeRepo.delete(employee);
		Map<String,Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
		
	}
}



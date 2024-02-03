package com.acharya.payroll.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acharya.payroll.repository.EmployeeModel;
import com.acharya.payroll.repository.EmployeeRepo;

@RestController
@RequestMapping("/")
@CrossOrigin(origins= {"http://localhost:5500"})
public class CommonController {

	@Autowired
	EmployeeRepo erepo;
	
	@GetMapping(value="/login")
	public List<EmployeeModel> senduser() {

		System.out.println("count is ="+erepo.count());
		List<EmployeeModel> emp=erepo.findAll()	;
		return emp;
		
		
		
		
	}
	
	
	
}

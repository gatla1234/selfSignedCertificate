package com.microservices.employee.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.model.Employee;


@RestController
public class EmployeeController {


		@RequestMapping(value = "/contractor", method = RequestMethod.GET)
		public Employee firstPage() {

			Employee emp = new Employee();
			emp.setName("Egiants");
			emp.setDesignation("Sr.java/j2ee Developer");
			emp.setEmpId("101");
			emp.setSalary(8000);

			return emp;
		}

	}


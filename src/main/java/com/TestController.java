package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Employee;

@RestController
public class TestController {

	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);

		return emp;
	}
	
	
	@RequestMapping(value = "/director", method = RequestMethod.GET)
	public Director secondPage() {

		Director dir = new Director();
		dir.setName("dir1");
		dir.setDesignation("director");
		dir.setEmpId("11");
		dir.setSalary(10000);

		return dir;

	}

}
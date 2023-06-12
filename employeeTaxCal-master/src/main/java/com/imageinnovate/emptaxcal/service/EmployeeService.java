package com.imageinnovate.emptaxcal.service;

import java.util.List;

import com.imageinnovate.emptaxcal.model.Employee;
import com.imageinnovate.emptaxcal.model.EmployeeVo;

public interface EmployeeService {
	
	 public int employeeAdd(Employee emp);
	 
	 public List<EmployeeVo> employeeDetails(String financialYear);

}

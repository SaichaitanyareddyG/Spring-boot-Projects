package com.example.Employee.service;

import com.example.Employee.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    EmployeeDTO addEmployee(EmployeeDTO employeeDTO);


    EmployeeDTO getEmployee(Integer emp_Id);
    EmployeeDTO updateEmployee(Integer emp_Id, EmployeeDTO employeeDTO);


    List<EmployeeDTO> getEmployees();
}

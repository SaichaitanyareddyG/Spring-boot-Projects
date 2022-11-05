package com.example.Employee.controller;

import com.example.Employee.dto.EmployeeDTO;
import com.example.Employee.entity.Employee;
import com.example.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/employee")
public class EmployeeController {
   @Autowired
  private EmployeeService service;
   @PostMapping("/save")
    public ResponseEntity<?>addEmployee(@RequestBody EmployeeDTO employeeDTO){
       EmployeeDTO employeeDTO1=service.addEmployee(employeeDTO);
       return new ResponseEntity<>(employeeDTO1, HttpStatus.CREATED);
   }
    @GetMapping("/get/{emp_Id}")
    public ResponseEntity<?> getEmployee(@PathVariable Integer emp_Id){

        return new ResponseEntity<>(service.getEmployee(emp_Id), HttpStatus.OK);

    }
    @PutMapping("/update/{emp_Id}")
    public ResponseEntity<?> updateCustomer( @PathVariable Integer emp_Id,@RequestBody EmployeeDTO employeeDTO){



        return new ResponseEntity<>(service.updateEmployee(emp_Id, employeeDTO), HttpStatus.NO_CONTENT);


    }
    @GetMapping("/getall")
    public List<EmployeeDTO> getEmployees() {
        return service.getEmployees();
    }

}

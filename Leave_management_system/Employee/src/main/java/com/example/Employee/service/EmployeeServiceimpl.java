package com.example.Employee.service;

import com.example.Employee.dto.EmployeeDTO;
import com.example.Employee.entity.Employee;
import com.example.Employee.respiratory.EmployeeRespiratory;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceimpl implements EmployeeService{
    @Autowired
    private EmployeeRespiratory employeeRespiratory;
    private final Long balance= Long.valueOf(26);
    @Override
    public EmployeeDTO addEmployee(EmployeeDTO employeeDTO) {
        employeeDTO.setLeave_balance(balance);
        System.out.print(employeeDTO.toString());
        Employee returnedEmployee= employeeRespiratory.save(new Employee(employeeDTO));

        return new EmployeeDTO(returnedEmployee);
    }




    @Override
    public EmployeeDTO getEmployee(Integer emp_Id) {

            Employee employee=null;
            Optional<Employee> optional= employeeRespiratory.findById(emp_Id);
            if(optional.isPresent()) {
                employee= optional.get();
            }

            return new EmployeeDTO(employee);
        }
    @Transactional
    @Override
    public EmployeeDTO updateEmployee(Integer emp_Id, EmployeeDTO employeeDTO) {

        Employee oldemployee=null;
        Optional<Employee> optional= employeeRespiratory.findById(emp_Id);
        oldemployee=optional.get();
        oldemployee.setEmp_name(employeeDTO.getEmp_name());
        oldemployee.setStart_date(employeeDTO.getStart_date());
        oldemployee.setEnd_date(employeeDTO.getEnd_date());

        long diff = ChronoUnit.DAYS.between(oldemployee.getStart_date(), oldemployee.getEnd_date());
        oldemployee.setNo_of_days(diff);
       
        oldemployee.setStatus(employeeDTO.getStatus());

     

            oldemployee.setLeave_balance(employeeDTO.getLeave_balance());
             
        oldemployee.setLeave_type(employeeDTO.getLeave_type());
        oldemployee.setLeave_reason(employeeDTO.getLeave_reason());

        employeeRespiratory.save(oldemployee);
        return new EmployeeDTO(oldemployee);

    }
    @Override
    public List<EmployeeDTO> getEmployees() {
        List<Employee> customerList=employeeRespiratory.findAll();
        return customerList
                .stream()
                .map(EmployeeDTO::new)
                .collect(Collectors.toList());
    }


}

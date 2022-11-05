package com.example.Employee.respiratory;

import com.example.Employee.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRespiratory extends JpaRepository<Employee,Integer> {
}

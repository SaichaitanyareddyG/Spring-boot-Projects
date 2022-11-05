package com.example.Employee.entity;

import com.example.Employee.dto.EmployeeDTO;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name="employee")
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer emp_Id;
    private String emp_name;
    private LocalDate start_date;
    private LocalDate end_date;
    private Long no_of_days;
    private String leave_type;
    private String leave_reason;
    private Long leave_balance= Long.valueOf(26);

    private String status;
    public Employee(EmployeeDTO employeeDTO){
        this.emp_Id=employeeDTO.getEmp_Id();
        this.emp_name=employeeDTO.getEmp_name();
        this.start_date=employeeDTO.getStart_date();
        this.end_date=employeeDTO.getEnd_date();
        this.no_of_days=employeeDTO.getNo_of_days();
        this.leave_type=employeeDTO.getLeave_type();
        this.leave_reason=employeeDTO.getLeave_reason();
        this.leave_balance=employeeDTO.getLeave_balance();
        this.status=employeeDTO.getStatus();
    }
	public Integer getEmp_Id() {
		// TODO Auto-generated method stub
		return emp_Id;
	}
	public String getEmp_name() {
		// TODO Auto-generated method stub
		return emp_name;
	}
	public LocalDate getStart_date() {
		// TODO Auto-generated method stub
		return start_date;
	}
	public Long getNo_of_days() {
		// TODO Auto-generated method stub
		return no_of_days;
	}
	public LocalDate getEnd_date() {
		// TODO Auto-generated method stub
		return end_date;
	}
	public void setEmp_Id(Integer emp_Id) {
		this.emp_Id = emp_Id;
	}

	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}
	public void setEnd_date(LocalDate end_date) {
		this.end_date = end_date;
	}
	public void setNo_of_days(Long no_of_days) {
		this.no_of_days = no_of_days;
	}
	public void setLeave_type(String leave_type) {
		this.leave_type = leave_type;
	}
	public void setLeave_reason(String leave_reason) {
		this.leave_reason = leave_reason;
	}
	public void setLeave_balance(Long leave_balance) {
		this.leave_balance = leave_balance;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Employee [emp_Id=" + emp_Id + ", emp_name=" + emp_name + ", start_date=" + start_date + ", end_date="
				+ end_date + ", no_of_days=" + no_of_days + ", leave_type=" + leave_type + ", leave_reason="
				+ leave_reason + ", leave_balance=" + leave_balance + ", status=" + status + "]";
	}
	public Long getLeave_balance() {
		// TODO Auto-generated method stub
		return leave_balance;
	}
	public String getLeave_reason() {
		// TODO Auto-generated method stub
		return leave_reason;
	}
	public String getLeave_type() {
		// TODO Auto-generated method stub
		return leave_type;
	}
	public String getStatus() {
		// TODO Auto-generated method stub
		return status;
	}
	public void setEmp_name(String emp_name2) {
		// TODO Auto-generated method stub
		this.emp_name = emp_name;

	}
	
public Employee() {
	
}
}

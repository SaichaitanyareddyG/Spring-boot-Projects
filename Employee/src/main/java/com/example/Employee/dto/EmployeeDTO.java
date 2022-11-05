package com.example.Employee.dto;

import com.example.Employee.entity.Employee;
import lombok.Data;
import lombok.NoArgsConstructor;


import com.example.Employee.entity.Employee;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDate;

@Data
    @NoArgsConstructor
    public class EmployeeDTO {

        private Integer emp_Id;
    private LocalDate start_date;
    private LocalDate end_date;
    private Long no_of_days;
    private String leave_type;
    private String leave_reason;
        private String emp_name;

        private  Long leave_balance= Long.valueOf(26);
    private String status;
        public EmployeeDTO(Employee employee){

            this.emp_Id=employee.getEmp_Id();
            this.emp_name=employee.getEmp_name();
            this.start_date=employee.getStart_date();
            this.end_date=employee.getEnd_date();
            this.no_of_days=employee.getNo_of_days();
            this.leave_type=employee.getLeave_type();
            this.leave_reason=employee.getLeave_reason();
            this.leave_balance=employee.getLeave_balance();
            this.status = employee.getStatus();


    }
		public String getEmp_name() {
			// TODO Auto-generated method stub
			return emp_name;
		}
		public LocalDate getStart_date() {
			// TODO Auto-generated method stub
			return start_date;
		}
		public Integer getEmp_Id() {
			// TODO Auto-generated method stub
			return emp_Id;
		}
		public LocalDate getEnd_date() {
			// TODO Auto-generated method stub
			return end_date;
		}
		public Long getNo_of_days() {
			// TODO Auto-generated method stub
			return no_of_days;
		}
		public Long getLeave_balance() {
			// TODO Auto-generated method stub
			return leave_balance;
		}
		public String getLeave_reason() {
			// TODO Auto-generated method stub
			return leave_reason;
		}
		public String getStatus() {
			// TODO Auto-generated method stub
			return status;
		}
		public String getLeave_type() {
			// TODO Auto-generated method stub
			return leave_type;
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
		public void setEmp_name(String emp_name) {
			this.emp_name = emp_name;
		}
		public void setLeave_balance(Long leave_balance) {
			this.leave_balance = leave_balance;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		@Override
		public String toString() {
			return "EmployeeDTO [emp_Id=" + emp_Id + ", start_date=" + start_date + ", end_date=" + end_date
					+ ", no_of_days=" + no_of_days + ", leave_type=" + leave_type + ", leave_reason=" + leave_reason
					+ ", emp_name=" + emp_name + ", leave_balance=" + leave_balance + ", status=" + status + "]";
		}
		public EmployeeDTO() {
			
		}

}

package com.spring.boot.SpringBootCRUD.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_employee_mas")
public class Empolyee {
	
	@Column(name="tem_emp_id")
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long empId;
	
	@Column(name="tem_emp_name")
	String empName;
	
	@Column(name="tem_emp_age")
	Long empAge;
	
	@Column(name="tem_emp_sal")
	Long empSal;
	
	@Column(name="tem_emp_dept")
	String empDept;
	
	@Column(name="tem_emp_emailid")
	String empEmailid;
	
	@Column(name="tem_emp_phno")
	Long empPhno;
	
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Long getEmpAge() {
		return empAge;
	}
	public void setEmpAge(Long empAge) {
		this.empAge = empAge;
	}
	public Long getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Long empSal) {
		this.empSal = empSal;
	}
	public String getEmpEmailid() {
		return empEmailid;
	}
	public void setEmpEmailid(String empEmailid) {
		this.empEmailid = empEmailid;
	}
	public String getEmpDept() {
		return empDept;
	}
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}
	public Long getEmpPhno() {
		return empPhno;
	}
	public void setEmpPhno(Long empPhno) {
		this.empPhno = empPhno;
	}
	
	
}

package com.acharya.payroll.repository;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
/*`id` int(20) NOT NULL,
  `employee_no` varchar(100) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `middlename` varchar(20) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `department_id` int(30) NOT NULL,
  `position_id` int(30) NOT NULL,
  `salary` double NOT NULL*/
@Entity
@Table(name="employee")
public class EmployeeModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id; 
	
	@Column(name="employee_no")
	 private String emp_no;
	
	@Column(name="firstname")
	private String emp_fnm;
	
	@Column(name="middlename")
	private String emp_mnm;
	
	@Column(name="lastname")
	private String emp_lnm;
	
	@Column(name="salary")
	private double salary;
	
	@ManyToOne(cascade=CascadeType.ALL, targetEntity = DepartmentModel.class)
	@JoinColumn(name="department_id", referencedColumnName="id")
	private DepartmentModel dep;
	
	@ManyToOne(cascade=CascadeType.ALL, targetEntity = PositionModel.class)
	@JoinColumn(name="position_id", referencedColumnName="id")
	private PositionModel pid;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(String emp_no) {
		this.emp_no = emp_no;
	}

	public String getEmp_fnm() {
		return emp_fnm;
	}

	public void setEmp_fnm(String emp_fnm) {
		this.emp_fnm = emp_fnm;
	}

	public String getEmp_mnm() {
		return emp_mnm;
	}

	public void setEmp_mnm(String emp_mnm) {
		this.emp_mnm = emp_mnm;
	}

	public String getEmp_lnm() {
		return emp_lnm;
	}

	public void setEmp_lnm(String emp_lnm) {
		this.emp_lnm = emp_lnm;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public DepartmentModel getDep() {
		return dep;
	}

	public void setDep(DepartmentModel dep) {
		this.dep = dep;
	}

	public PositionModel getPid() {
		return pid;
	}

	public void setPid(PositionModel pid) {
		this.pid = pid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
package com.acharya.payroll.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/* `id` int(30) NOT NULL,
  `name` text NOT NULL*/

@Entity
@Table(name="department")
public class DepartmentModel {
	
	@Id
	private Integer id;
	@Column(name="name")
	 private String dname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}

	
	
}

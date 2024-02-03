package com.acharya.payroll.repository;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/*`id` int(30) NOT NULL,
`department_id` int(30) NOT NULL,
`name` text NOT NULL*/

@Entity
@Table(name="position")
public class PositionModel {
	
	@Id
	private Integer id;
	
	@ManyToOne(cascade=CascadeType.ALL, targetEntity = DepartmentModel.class)
	@JoinColumn(name="department_id", referencedColumnName="id")
	private DepartmentModel depid;
	
	@Column(name="name")
	private String pnm;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public DepartmentModel getDepid() {
		return depid;
	}

	public void setDepid(DepartmentModel depid) {
		this.depid = depid;
	}

	public String getPnm() {
		return pnm;
	}

	public void setPnm(String pnm) {
		this.pnm = pnm;
	}
	
	
	

}

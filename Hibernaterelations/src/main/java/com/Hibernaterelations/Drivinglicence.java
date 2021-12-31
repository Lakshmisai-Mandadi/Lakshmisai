package com.Hibernaterelations;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Drivinglicence {
	@Id
	private String dlic_no;
	@OneToOne
	private Employee employee;
	
	public String getDlic_no() {
		return dlic_no;
	}
	public void setDlic_no(String dlic_no) {
		this.dlic_no = dlic_no;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	@Override
	public String toString() {
		return "Drivinglicence [ dlic_no=" + dlic_no + "]";
	}
	
	

}

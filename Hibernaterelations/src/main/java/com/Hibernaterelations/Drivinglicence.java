package com.Hibernaterelations;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Drivinglicence {
	@Id
	private String Dlic_no;
	@OneToOne
	private Employee e;
	
	public String getDlic_no() {
		return Dlic_no;
	}
	public void setDlic_no(String dlic_no) {
		Dlic_no = dlic_no;
	}
	
	public Employee getE() {
		return e;
	}
	public void setE(Employee e) {
		this.e = e;
	}
	@Override
	public String toString() {
		return "Drivinglicence [ Dlic_no=" + Dlic_no + "]";
	}
	
	

}

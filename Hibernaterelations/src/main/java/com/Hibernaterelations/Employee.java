package com.Hibernaterelations;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity

public class Employee {
@Id
private int Emp_id;
	private String Emp_name;
	public int getEmp_id() {
		return Emp_id;
	}
	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}
	public String getEmp_name() {
		return Emp_name;
	}
	public void setEmp_name(String emp_name) {
		Emp_name = emp_name;
	}
	@Override
	public String toString() {
		return "Employee [Emp_id=" + Emp_id + ", Emp_name=" + Emp_name + "]";
	}

}

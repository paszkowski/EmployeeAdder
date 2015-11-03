package asd;

import java.io.Serializable;

public class Company implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1258444015391739638L;

	public static final int MAX_EMPLOYEE = 3;
	
	private Employee[] employees;

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	
	public Company() {
		employees = new Employee[MAX_EMPLOYEE];
	}
	
	public void add(Employee emp, int index ) {
		employees[index] = emp;
	}
	

}

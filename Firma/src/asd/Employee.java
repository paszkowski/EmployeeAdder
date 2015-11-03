package asd;

public class Employee extends Person {
	
	private static final long serialVersionUID = 4420226460862818754L;
	private double salary; 
	
	public Employee (String imie, String nazwisko, double salary) {
		super(imie, nazwisko);
		setSalary(salary);
		
		
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
public String toString() {
	return super.toString() + "  wyplata w sumie " + salary;
}

}

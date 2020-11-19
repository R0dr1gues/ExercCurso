package entities;

public class Employee {
	public String  name;
	public double bruteSalary;
	public double tax;
	
	public double netSalary(){
		return bruteSalary - tax;
	}
	public void increaseSalary(double percentage) {
		bruteSalary += bruteSalary * percentage / 100.0; 
	}
	public String toString() {
		return name + ", $ "+ String.format("%.2f", netSalary());
	}
	
	
}

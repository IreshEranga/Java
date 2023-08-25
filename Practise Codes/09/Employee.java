package pkg2;

public class Employee {

	private String name;
	private double salary;
	
	public Employee() {}

	public Employee(String name, double salary) {
	
		this.name = name;
		this.salary = salary;
	}
	
	public void diaplayInfo() {
		System.out.println("EMP Name : "+name);
		System.out.println("EMP salary : "+salary);
	}
}
	

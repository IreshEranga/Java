package q1;

public abstract class Employee {

	private int id;
	private String name;
	
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void display() {
		
		System.out.println("Emp ID : "+id);
		System.out.println("Emp Name : "+name);
	}
	
	//abstract method
	public abstract double calculateNetSalary();
	
}

package q1;

public class TemporaryEmp extends Employee{

	private int OtHrs;
	private double OtRate;
	private double minWage;
	
	
	public TemporaryEmp(int id, String name, int OtHrs, double OtRate) {
		super(id, name);
		this.OtHrs = OtHrs;
		this.OtRate = OtRate;
		minWage = 15000;
	}


	@Override
	public double calculateNetSalary() {
		
		return (OtRate*OtHrs) + minWage;
	}


	@Override
	public void display() {
		
		super.display();
		System.out.println("Minimum Wage : "+minWage);
		System.out.println("Net Salary : "+calculateNetSalary());
		
	}
	
	
	
	
}

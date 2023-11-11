package q1;

public class PermanentEmp extends Employee{

	
	private double basicSal;
	private double commission;
	
	
	public PermanentEmp(int id, String name, double basicSal) {
		super(id, name);
		this.basicSal = basicSal;
		commission = 0.15*basicSal;
	}

	

	@Override
	public double calculateNetSalary() {
		
		return basicSal + commission;
		
		
	}


	@Override
	public void display() {
		
		super.display();
		System.out.println("Basic Salary : "+basicSal);
		System.out.println("Commission : "+commission);
		System.out.println("Net salary : "+calculateNetSalary());
	}
	
	
	
	
}

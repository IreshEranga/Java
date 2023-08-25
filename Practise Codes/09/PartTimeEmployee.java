package pkg2;

public class PartTimeEmployee extends Employee{
	private int OTHrs;

	public PartTimeEmployee(String name, double salary,int OTHrs) {
		super(name,salary);
		this.OTHrs = OTHrs;
	}
	
	public void displayEmpInfo() {
		super.diaplayInfo();
		System.out.println("OTHours : "+OTHrs);
		
	}
}

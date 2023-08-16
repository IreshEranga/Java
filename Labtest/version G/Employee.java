package package1;
import java.util.Scanner;

public class Employee {
	
		String EmpId;
		String name;
		String address;
		
		public Employee(){
			
		}
		
		public Employee(String EmpId,String name, String address )
		{
			this.EmpId = EmpId;
			this.name = name;
			this.address = address;
			
		}
		
	public void Read()
	{
		Scanner emp = new Scanner(System.in);
		
		System.out.println("Enter your Employee ID  : ");
	/*	String */this.EmpId = emp.nextLine();
		
		System.out.println("Enter your Name  : ");
		/*String*/ this.name = emp.nextLine();
		
		System.out.println("Enter your Address  : ");
		/*String*/ this.address = emp.nextLine();
	}
	
	
	public void Print()
	{
		System.out.println("Your ID IS : "+this.EmpId);
		System.out.println("Your name IS : "+this.name);
		System.out.println("Your address IS : "+this.address);
	}
}

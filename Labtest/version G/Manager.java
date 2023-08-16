
/**
 * 
 */
package package1;

import java.util.Scanner;
/**
 * 
 */
public class Manager extends Employee{
	
	String Department;
	int ProductNo1;
	int ProductNo2;
	int ProductNo3;
	
	public Manager() {
		
	}
	
	public Manager(String EmpId,String name, String address,String Department, int ProductNo1, int ProductNo2, int ProductNo3)
	{
		super(EmpId,name,address);
		this.Department = Department;
		this.ProductNo1 = ProductNo1;
		this.ProductNo2 = ProductNo2;
		this.ProductNo3 = ProductNo3;
	}
	
	public void Read() {
		
		super.Read();
		
		Scanner man = new Scanner(System.in);
		
		System.out.println("Enter Department : ");
		/*String*/ this.Department = man.nextLine();
		
		try {
		System.out.println("Product 01 : ");
		/*int*/ this.ProductNo1 = man.nextInt();
		
		System.out.println("Product 02 : ");
		/*int*/ this.ProductNo2 = man.nextInt();
		
		System.out.println("Product 03 : ");
		 this.ProductNo3 = man.nextInt();
		}
		catch(Exception e){
			System.out.println("Product Number wrong");
		}
		
		
	}
	
	public void Print() {
		super.Print();
		System.out.println("Dep : "+this.Department);
		System.out.println("P1 : "+this.ProductNo1);
		System.out.println("P2 : "+this.ProductNo2);
		System.out.println("P3 : "+this.ProductNo3);
	}
}

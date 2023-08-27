package pkg1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		
		System.out.println("Enter your ID : ");
		String ID = std.nextLine();
		
		System.out.println("Enter your Name : ");
		String Name = std.nextLine();
		
		System.out.println("Enter your 01 mark : ");
		Double mark1 = std.nextDouble();

		System.out.println("Enter your 02 mark : ");
		Double mark2 = std.nextDouble();
		
		System.out.println("Enter your 03 mark : ");
		Double mark3 = std.nextDouble();
		
		//Student std1 = new Student(ID,Name,mark1,mark2,mark3);
		Student std1 = new Student(ID,Name);
		std1.inm(mark1, mark2, mark3);
		std1.calAvg();
	
		
		std1.showDetails(ID, Name, std1.calAvg());
	}

}

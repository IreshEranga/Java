package pkg2;

public class EmpApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PartTimeEmployee emp1 = new PartTimeEmployee("Alice", 20000.00,7);
		PartTimeEmployee emp2 = new PartTimeEmployee("Iresh", 560000.00,10);
		
		emp1.displayEmpInfo();
		emp2.displayEmpInfo();
	}

}

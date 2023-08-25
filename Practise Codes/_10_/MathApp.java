package mathoppkg3;
import java.util.Scanner;

public class MathApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathOperations m1 = new MathOperations();
		
		Scanner f = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int number = f.nextInt();
		
		System.out.println("Enter range : ");
		int range = f.nextInt();
		
		m1.drawMultiplicationTable(number, range);
		m1.factorial();
	}

}

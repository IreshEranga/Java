

package pkg;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner r = new Scanner(System.in);
		
		System.out.println("Enter length : ");
		double length = r.nextDouble();
		
		System.out.println("Enter width : ");
		double width = r.nextDouble();
		
		Rectangle r1 = new Rectangle(length,width);
		r1.calcArea(/*length,width*/);
		r1.showdet();
	}

}

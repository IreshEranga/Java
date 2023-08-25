package mathoppkg3;
import java.util.Scanner;

public class MathOperations {

	private int number;
	private int range;
	
	/*public MathOperations()
	{}*/
	
	public void drawMultiplicationTable(int number,int range)
	{
		for(int i=number; i<=range;i++)
		{
			System.out.println("Multiplication table for "+i+"\n");
			
			for(int j=1;j<=10;j++)
			{
				System.out.println(""+i+" * "+j+" = "+i*j);
			}
			System.out.println("\n\n");
		}
	}
	
	public int factorial()
	{
		Scanner fac1 = new Scanner(System.in);
		System.out.println("Enter a positive integer : ");
		int num = fac1.nextInt();
		
		int fac = 1;
		
		if(num < 0)
		{
			return 0;
		}
		else
		{
			for(int k = num ; k>=1;k--)
			{
				 fac *= k;
			}
			
		}
		System.out.println("Factorial of "+num+" is "+fac);
		return fac;
		
		
		
	}
}

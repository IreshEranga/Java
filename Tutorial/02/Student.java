package pkg1;

public class Student {
//variables
	private String ID;
	private String name;
	private double mark1;
	private double mark2;
	private double mark3;
	
	public Student(String ID, String name)
	{
		this.ID = ID;
		this.name = name;
		mark1 = 0;
		mark2 = 0;
		mark3 = 0;
	}
	
	public void inm(double mark1, double mark2, double mark3)
	{
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	public double calAvg()
	{
		return (mark1 + mark2 + mark3)/3.0;
	}
	
	public void showDetails(String ID,String Name, double calAvg)
	{
		System.out.println("ID : "+ID+" Name : "+name+" Average : "+calAvg());
	}
}

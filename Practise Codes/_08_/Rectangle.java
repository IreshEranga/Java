package pkg;

public class Rectangle {

	//variables
	private double length;
	private double width;
	
	public Rectangle() {
	}

	public Rectangle(double length, double width) {
		
		this.length = length;
		this.width = width;
	}
	
	public double calcArea(/*double length, double width*/)
	{
		return  length*width;
	}
	
	public void showdet()
	{
		System.out.println("Area = "+calcArea(/*length,width*/));
	}
	}
	
	

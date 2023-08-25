package p4;

public class Vehicle {

	private String model;
	private double rentalPricePerDay;
	
	public Vehicle()
	{
		
	}
	
	public Vehicle(String model, double rentalPricePerDay )
	{
		this.model = model;
		this.rentalPricePerDay = rentalPricePerDay;
	}
	
	public double calculateRentalCost(int days) {
		//days = 5;
		return rentalPricePerDay*days;
	}
	
	}

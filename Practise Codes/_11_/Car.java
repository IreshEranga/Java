package p4;

public class Car extends Vehicle {

	private int numSeats;
	
	public Car(String model, double rentalPricePerDay, int numSeats)
	{
		super(model,rentalPricePerDay);
		this.numSeats = numSeats;
	}
	
}

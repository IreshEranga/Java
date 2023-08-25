package p4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("Toyota",5000,5);
		Motorcycle m1 = new Motorcycle("bajaj",1000,120);
		
		double mrp =  m1.calculateRentalCost(5);
		double crp = c1.calculateRentalCost(10);

		System.out.println("Car rental price for 10 days "+crp+" .");
		System.out.println("Bike rental price for 5 days "+mrp+" .");
	}

}

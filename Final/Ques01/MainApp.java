package q1;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		
		ArrayList<Item> arrList = new ArrayList<>();
		
		Book b1 = new Book(1,"book1",100.00,"abc","story",120);
		Book b2 = new Book(2,"book2",200.00,"def","education",200);
		
		arrList.add(b1);
		arrList.add(b2);
		
		Car c1 =new Car (3,"car1",100000,"toyota","a");
		Car c2 =new Car (4,"car2",1250000,"benz","g");
		
		arrList.add(c1);
		arrList.add(c2);
		
		for(Item item : arrList)
		{
			item.Display();
			System.out.println();
		}
		
	}

}

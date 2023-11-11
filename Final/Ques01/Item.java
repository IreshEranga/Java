package q1;

public abstract class Item {

	private int itemNo;
	private String description;
	private double unitPrice;
	
	//generate constructor
	public Item(int itemNo, String description, double unitPrice) {
		super();
		this.itemNo = itemNo;
		this.description = description;
		this.unitPrice = unitPrice;
	}
	
	public void Display()
	{
		System.out.println("Item No: "+itemNo);
		System.out.println("Description: "+description);
		System.out.println("Unit Price: "+unitPrice);
		
	}
}

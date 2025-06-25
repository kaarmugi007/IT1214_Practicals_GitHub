import java.util.*;

class Product{
	private String name;
	private int unitPrice;
	
	Product(String name, int price){
		this.name=name;
		this.unitPrice=price;
	}
	
	public String getName(){
		return name;
	}
	
	public int getUnitPrice(){
		return unitPrice;
	}
	
	public void setUnitPrice(int newPrice){
		unitPrice=newPrice;
	}
	
	public void printProductDetail(){
		System.out.println("Name:" + name + ", Unit Price:" + unitPrice);
	}
}

	

class BillEntry{
	Product product;
	int quantity; //number of units
	
	BillEntry(Product product, int qty){
		this.product =product;
		this.quantity=qty;
	}
	
	/*int getTotal(){
		return product.getPrice()*quantity;
	}*/
	
	void printBillEntry(){
		System.out.println("Product Name:" + product.getName() + ", Unit Price:" + product.getUnitPrice() + ", Number of Units:" +  quantity + ", Total Price:" + product.getUnitPrice()*quantity);
	}
}

class Bill{
	ArrayList<BillEntry> billEntries = new ArrayList<>();
	
	void addEntry(BillEntry be){
		billEntries.add(be);
	}
	
	void printBill(){
		int total=0;
		for(BillEntry e: billEntries){
			total += e.product.getUnitPrice()*e.quantity;
			System.out.println(e.product.getName() + " x " + e.quantity + " = " + e.product.getUnitPrice()*e.quantity);
		}
		System.out.println("Total Bill: " + total);
	}
}


class BillDemo{
	
	static void print(String s){
		System.out.println(s);
	}
	
	static void printProductDetail(Product product){
		print("Name " + product.getName() + ", Unit Price " + product.getUnitPrice());
	}
	
	public static void main(String[] arg){
		print("Welcome to Demo Shop!");
		print("Entering Products");//setting up the product and products
		print(" ");
		
		Product milk = new Product("Diamond",140);
		print("Succesfully added!");
		printProductDetail(milk);
		//milk.printProductDetail();
		
		Product bread = new Product("Prima",160);
		/*print("Succesfully added!");
		printProductDetail(bread);
		bread.printProductDetail();
		
		bread.setUnitPrice(165);//changing the unitPrice to a newPrice
		print("Succesfully changed the unitPrice!");
		printProductDetail(bread);*/
		
		print(" ");
		print ("Entering new Bill Entries!");
		BillEntry be1 = new BillEntry(milk,10);
		be1.printBillEntry();
		print(" ");
		
		Bill b=new Bill();
		b.addEntry(be1);
		b.addEntry(new BillEntry(bread,5));
		b.addEntry(new BillEntry(new Product("Sugar",250),3));
		print("Printing Bill!");
		b.printBill();
		
	}
}
import java.util.*;

class Item{
	private String description;
	private String name;
	private double unitPrice;
	private int quantityAvailable;
	
	Item(String description, String name, double unitPrice, int quantityAvailable){
		this.description=description;
		this.name=name;
		this.unitPrice=unitPrice;
		this.quantityAvailable=quantityAvailable;
	}
	
	public String getName(){
		return name;
	}
	
	public double getUnitPrice(){
		return unitPrice;
	}
	
	public String getDescription(){
		return description;
	}
	
	public int getQuantityAvailable{
		return quantityAvailable;
	}
	
	public void updateQuantity (int amount, String choice){
		if (choice=="I"){
			quantityAvailable = quantityAvailable+amount;
		}
		else if (choice == "D"){
			quantityAvailable = quantityAvailable - amount;
		} 
		else{
			System.out.println("Invalid Input!");
		}
	}
	
	public void printDetails() {
		System.out.println("Name: " + name + ", Description: " + description + ", Unit Price" + unitPrice + ", Quantity Available: " + quantityAvailable);
	}
	
	public void setUnitPrice(int newPrice){
		unitPrice=newPrice;
	}

}

class Customer{
	String name;
	String contactDetails;
	
	public String getCustomerName(){
		return name;
	}
	
	public String getContactDeatails(){
		return contactDetails;
	}
}

class Database{
	
	ArrayList<Item> items = new ArrayList<>();
	
	void addItem(Item i){
		items.add(i);
	}
	
	void addItem(Item i){ 
		items.remove(i);
	}
	
	ArrayList<Customer> customers = new ArrayList<>();
	
	void addCustomer(Customer c){
		customers.add(c);
	}
	
	void addCustomer(Customer c){
		customers.remove(c);
	}
	
	static void printMenu(){
		System.out.println("------ Inventory Management ------");
		System.out.println("1. Add Item");
		System.out.println("2. Remove Item");
		System.out.println("3. Update Item Quantity");
		System.out.println("4. List All Items");
		System.out.println("5. Add Customer");
		System.out.println("6. List All Customers");
		System.out.println("7. Search Item by Name");
		System.out.println("0. Exit");
		System.out.println("---------------------------------");
		System.out.println("Choose an Option");
		
	}
	
	public static selection(int choice){
		Switch(choice){
			case 1: 
				System.out.print
		}
	}
	
	public static void main(String [] arg){
        Scanner sc=new Scanner(System.in);
        int option;
        do{
            printMenue();
            option=sc.nextInt();
        }while(option!=0);

    }
}
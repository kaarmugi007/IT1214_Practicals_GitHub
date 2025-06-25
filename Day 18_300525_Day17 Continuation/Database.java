
import java.util.*;

class Item{
	private String description, name;
	private double unitPrice;
	private int quantityAvailable;
	
	public Item(String dec, String name, double unitPrice,int qtyAvailable){
		this.name=name;
		this.description=dec;
		this.unitPrice= unitPrice;
		this.quantityAvailable=qtyAvailable;
	}
	public String getName(){
		return name;
	}
}

public class Database{
  //  ArrayList<Customer> customers=new ArrayList<>();
  static ArrayList<Item> items=new ArrayList<>();
  static Scanner sc=new Scanner(System.in);
  
	static void addItem(Item itm){
			items.add(itm);
	}
	
	static void removeItem(String item_name){
		
		for (Item e: items){
				
				if(e.getName().equals(item_name)){
					items.remove(e);
				}
		}
		
		
	}
	
	static void listAllItems(){
		System.out.println("Listing Items Available");
		for(Item e:items){
			System.out.println("Item name:"+e.getName());
		}
	}
	
    static void printMenue(){
        System.out.println("------ Inventory Management ------");
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item");
        System.out.println("3. Update Item Quantity");
        System.out.println("4. List all items");
        System.out.println("5. Add Customer");
        System.out.println("6. List all Customers");
        System.out.println("7. Search Item by Name");
        System.out.println("0. Exit");
        System.out.println("Choose an Option");   
    }

    public static void select(int choice){
        
            switch(choice){
      				case 1:
      					System.out.print("Please enter Item Name   :");
      					String name = sc.nextLine();
      					
      					System.out.print("Please enter Description  :");
      					String description = sc.nextLine();
      					
      					System.out.print("Please enter Unit Price   :");
      					int Price = Integer.parseInt(sc.nextLine());
      					
      					System.out.print("Please enter Quantity Available  :");
      					int Quantity = Integer.parseInt(sc.nextLine());
      					
      					Item item = new Item(name, description, Price, Quantity);
      					addItem(item);
      					break;
      					
      				case 2:
      					System.out.print("Please enter Item Name to remove");
						
      					String itmName=new Scanner(System.in).nextLine();
      					removeItem(itmName);
      					break;

              case 3:
      					//Add method here
      					break;

              case 4:
      					listAllItems();
      					break;
                
      				case 5:
      					//Add method here
      					break;

              case 6:
      					
      					break;

              case 7:
                //Add method here
      					break;
                
      				case 0:
      					
      					break;
      			}

        }
    

    public static void main(String [] arg){
        
        int option;
        do{
            printMenue();
            option=sc.nextInt();
      		select(option);
        }while(option!=0);

    }
}

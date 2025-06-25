import java.util.*;

public class ArrayL{
	public static void main (String args[])
	{
		//creating empty arraylist
		ArrayList<Integer> a1 = new ArrayList<>();
		
		//use add() mtd to add an element
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(1);
		a1.add(5);
		a1.add(9);
		
		//adding an element to the arraylist to a specific index (eg:- i=2 --> 22)
		a1.add(2,22);
		System.out.println("" + a1);
		
		//removing an element from the arraylist using the index(remove 20)
		a1.remove(1);
		System.out.println("" + a1);
		
		//removing an element from the arraylist using the value(remove 10) by using the object 
		a1.remove(Integer.valueOf(10));
		System.out.println("" + a1);
		
		//removing the elements which are less than 10
			//creating an Iterator Object
		Iterator itr = a1.iterator();
		
		while(itr.hasNext())
		{
			int x = (Integer)itr.next();
			System.out.println("" + x);
			if(x<10)
				itr.remove();
			
		}
		
		//enhanced for loop
		System.out.println("Printing the elements using enhanced for loop");
			for(Integer e: a1)
			{
				System.out.println(e+ "->");
			}
		System.out.println("printing a1");	
		System.out.println("" + a1);
	
	}
}
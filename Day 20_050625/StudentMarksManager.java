/*Write a java program using ArrayList to manage the marks of Students.
	1.Accept 10 student marks from the user and store them in the ArrayList<String>
	
	2.Display all the student marks
	
	3.Calculate and display the average
	
	4.Display the highest and lowest marks
	
	5.Remove any marks less than 40 and display the updated list
	
	
	Get the user input and storing marks - 2
	Display the list - 1
	Calculating average - 3
	Find the highest and lowest - 2
	Filtering marks less than 40 -3
	
	Total - 11
	*/
	
import java.util.*;

public class StudentMarksManager{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> marks = new ArrayList<>();
		
		//Accept 10 student Marks
		System.out.println("Enter 10 Student marks");
		
		for (int i = 0; i < 10; i++){
		System.out.println("Enter the Marks of Student " + (i+1));
		marks.add(sc.nextInt());
		}
		
		//display all the student marks
		System.out.println("Marks List: ");
		System.out.println(marks);
	
		Iterator itr = marks.iterator();
		
		//calculating and displaying the average
		int sum = 0;
		double average = 0;
		int highestMarks = 0;
		int lowestMarks = 100;
		int x;
		
		/*while(itr.hasNext())
		{
			int y = (Integer)itr.next();
			
		}*/
		
		
		//removing the marks less than 40
		while(itr.hasNext())
		{
			 x = (Integer)itr.next();
			
			
			if(highestMarks<x){
				highestMarks =x;
			}
			
			if(lowestMarks>x){
				lowestMarks =x;
			}
			
			sum += x;
			average = sum/10;
			
			if(x<40)
				itr.remove();			
		}
		
		System.out.println("Average marks of the students is " + average);
		System.out.println("Highest marks is " + highestMarks);
		System.out.println("Lowest marks is " + lowestMarks);
		System.out.println("The updated marks list: ");
		System.out.println(marks);
			
		
	}
}
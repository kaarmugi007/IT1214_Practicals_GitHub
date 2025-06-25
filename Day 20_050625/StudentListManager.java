/*Write a java program using ArrayList to manage a list of student names.
	1.Accept 5 student name from the user and store them in the ArrayList<String>
	2.Display all the student names
	3.Ask the user to enter a name to search. if found, display the position
	  if not found display the message "Student not found"
	4.Ask the user to enter a name to remove from the list. after remove display the updated list.
	
	Get the user input and storing names - 3
	Display the list - 2
	Searching and display index - 2
	Removing the name and updating list - 3
	Total - 10
	ME 3/10   :( //that's also #copied from last class
	
	*/
	

import java.util.ArrayList;
import java.util.Scanner;

public class StudentListManager{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> students = new ArrayList<>();
		
		//Accept 5 student names
		System.out.println("Enter 5 Student names");
		
		for (int i = 0; i < 5; i++){
		System.out.println("Enter the name of Student " + (i+1));
		students.add(sc.nextLine());
		}
		
		//display all the student names
		System.out.println("Student List: ");
		System.out.println(students);
		
		//Search for a name
		System.out.println("Enter a name to search: ");
		String searchName = sc.nextLine();
		
		if(students.contains(searchName)){
			int index = students.indexOf(searchName);
			System.out.println(searchName + " found at index " + index);
		} else 
		{
			System.out.println("Student not found");
		}
		
		
		//Search for a name and remove if found
		System.out.println("Enter a name to remove: ");
		String removeName = sc.nextLine();
		
		if(students.contains(removeName)){
			students.remove(removeName);
			System.out.println("Updated student list: ");
			System.out.println(students);
			
		} else 
		{
			System.out.println("Student not found");
		}
		
	}
}
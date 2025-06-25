import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;

public class StudentMarksManagerAnswer{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> marks = new ArrayList<>();
		
		//Accept Student Marks
		System.out.println("Enter marks for 10 students: ");
		
		for(int i=0; i<10; i++){
			System.out.println("Enter the marks " + (i+1) +":");
			int mark = sc.nextInt();
			marks.add(mark);
		}
		
		//Display all marks
		System.out.println("\n All student marks: " + marks);
		
		//Calculate and display the average
		int sum=0;
		for(int mark: marks){
			sum += mark;
		}
		
		double average = sum/marks.size();
		System.out.println("\n Average mark: " + average);
		
		
		//Display the highest and lowest marks
		int highestMarks = Collections.max(marks);
		int lowestMarks = Collections.min(marks);
		System.out.println(" Highest marks: " + highestMarks);
		System.out.println(" Lowest marks: " + lowestMarks);
		
		//Remove marks less than 40
		Iterator<Integer> iterator = marks.iterator();
		
		while(iterator.hasNext()){
			int mark = iterator.next();
			if (mark<40)
			{
					iterator.remove();
			}
		}
		
		//Display the updated student marks list
		System.out.println("\n Updated student marks: " + marks);
		sc.close();
		
	}
}
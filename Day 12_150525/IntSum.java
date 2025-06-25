//create a main class to input 10 integers from user input and
//find the sum of the ten integers.
import java.util.Scanner;
class IntSum {
	public static void main (String[] args){
		int[] num = new int[10];
		int sum =0;
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<10; i++){
			System.out.println("Enter the integer " + (i+1) + ": ");
			
		try{
			
			num[i] = sc.nextInt();
			
		}
		catch (Exception e) {
			System.out.println("An error Occurred!");
			System.out.println("The error is " + e.getMessage());
			System.out.println("Enter the integer " + (i+1) + ": ");
			num[i] = sc.nextInt();
			
		}
		}
		
		for (int i=0; i<10;i++){
			sum+=num[i];
		}
			System.out.println("The sum is " + sum);
		
	}
}
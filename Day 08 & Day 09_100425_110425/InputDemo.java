import java.util.*;
class InputDemo{
	public static void main (String[] args){
		String name;
		int age;
		byte marks;
		//char grade;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi Enter your Name:");
		name = sc.nextLine(); //read String until you press the enter key
		System.out.println("Hello " + name + ", How are you?");
		System.out.println("Hi Enter your age: ");
		age=sc.nextInt();//read the int value
		System.out.println("Ohh god! Are you " + age + " years old?");
		System.out.println("Enter your Marks: ");
		marks = sc.nextByte();
		System.out.println("You have got " +  marks + " marks.");
		/*System.out.println("Enter your Grade: ");
		name = sc.nextLine();
		System.out.println("You have got " +  grade + " grade.");*/
	}
}
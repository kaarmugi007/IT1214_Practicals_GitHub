class Student{
	int marks;
	String name;
	
	Student(){//constructor will always have the class name, and no return values here
		System.out.println("Creating a Student Object");
		name = "Default Name";
	}
	
	Student(String n, int m){//constructor will always have the class name, and no return values here
		System.out.println("Creating a Student Object with name "+ n + " and marks " + m );
		//name = n;
		//marks = m;
	}
}

/*class Printer{
	void print(String s){
		System.out.println(s);
	} 
}*/

class App{
	public static void main(String[] args){
		//Printer p=new Printer();
		//p.print("Welcome to Demo Class App!");
		System.out.println("Welcome to Demo Class App!");
		
		Student s1 = new Student();
		System.out.println("Name of the Student s1 = " + s1.name);
		s1.marks = 90;
		s1.name = "Harry";
		System.out.println("Name of the Student s1 = " + s1.name);
		//p.print("Name of the Student s1 = " + s1.name);
		//p.print("Marks of the Student s1 = " + s1.marks);
		
		Student s2 = new Student("Bob",50);
		//s2.marks = 50;
		//s2.name = "Bob";
		System.out.println("Name of the Student s2 = " + s2.name);
		System.out.println("Marks of the Student s2 = " + s2.marks);
		
	}
}
class Student{//class
	String name="Adam";
	int marks=100;
	
	Student(){
		name="NoName";
	}

	Student(String n){//constuctor overloading
		name=n;
	}	
	
	Student(String n, int m){
		name=n;
		marks=m;
	}
	
}


class StudentDemo{//class
	public static void main(String[] args){//method
		System.out.println("From Student Demo Class");
		System.out.println("Creating an object of Student Class");
		Student s1=new Student("Nice Name",85); //constructor declaring s1 as the student(s1 is the new student object).
		System.out.println("Created an object of Student Class");
		
		System.out.println("Name value of the object is " +s1.name);
		System.out.println("Marks value of the object is " +s1.marks);
		
		s1.name="Bob";//setting the variable value
		s1.marks=10;
		
		System.out.println("Name value of the object is " +s1.name);//getting the variable value
		System.out.println("Marks value of the object is " +s1.marks);
	}
}
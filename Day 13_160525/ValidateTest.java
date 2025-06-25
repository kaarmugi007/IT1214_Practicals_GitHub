/*class ValidateTest{
	
}*/

class Student{
	private String name;
	private int exam1;
	private int exam2;
	private int exam3;
	ValidateTest vt=new ValidateTest();
	
	boolean validateMarks(int marks){
		if (marks<=100 && marks>=0){
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	Student(String na, int e1, int e2, int e3){
		name=na;
		
		if (validateMarks(e1)){
		exam1=e1;
		}
		else
		{
			System.out.println("Invalid Marks");
		}
		exam2=e2;
		exam3=e3;
	}
	
	String getName(){
		return name;	
	}
	
	int getExam1(){
		return exam1;
	}
	
	int getExam2(){
		return exam2;
	}
	
	int getExam3(){
		return exam3;
	}
	
	
}


class StudentDemo{
	public static void main (String[] args){
		Student s1=new Student("Adam",99,102,-55);
		Student s2=new Student("Eve",99,88,75);
		
		System.out.println("Name of the Student 1 is " + s1.getName());
		System.out.println("Marks of the Student 1 for Exam 1 is " + s1.getExam1());
		
		System.out.println("Name of the Student 1 is " + s2.getName());
		System.out.println("Marks of the Student 1 for Exam 1 is " + s2.getExam1());
	}
}







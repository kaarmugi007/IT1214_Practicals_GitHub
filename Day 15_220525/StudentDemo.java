import java.util.*;

class Student{
	String name;
	int age;
	Student(String name, int name){
		this.name=name;
		this.age=age;
	}
	
}

class StudentDemo{
	public static void main(){
	ArrayList<Student> stds= new ArrayList<>();
	Student s1=new Student("Harry",24);
	Student s2=new Student("Hermione",22);
	Student s3=new Student("Ron",23);
	
	stds.add(s1);
	stds.add(s2);
	stds.add(s3);
	stds.add(new Student("Malfoy",21));
	
	for(Student s: stds){
		System.out.println("Name: " + s.name + " Age: " + s.age);
	}
	}
	
}
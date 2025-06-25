package a;

//class public 
public class Test { 
//method isn't public
	void print(){
		System.out.println("Hi from class Test in package a");
	}
	
//method public
	public void display(){
		print();
		System.out.println("Display:Hi from class Test in package a");
	}
}
class C {	
	C(){
		
	}
	
	C(String s){
		System.out.println(s);
	}
	
	public void print(String s){
		System.out.println(s);
	}
	
	String messageFromC(){
		return "Hi From C";
	}
}
class A{

	A(){//constructor
		new C("This is from Constructor").print("Hi from A");//new object C obC = new C(); obC.print("Hi from A!");
	}

}


public class B{
		void print(String str){
			System.out.println("From B: " + str);
	}
	public static void main(String [] args){
		B objectOfB = new B();
		objectOfB.print("Hi");
		C prt = new C();
		/*A obA=new A();
		prt.print("Hello!");
		new C("Hello World!");*/
		objectOfB.print(prt.messageFromC());
		new C (new C().messageFromC());
	}

}
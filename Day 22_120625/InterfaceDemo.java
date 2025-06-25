interface A{
	void method1 (String a);
	void method2 ();
	//void method3 (int a);
}

class C implements A{
	public void method1(String s){
		System.out.println("From C: " + s);
	}
}


class D {
	
}

public class InterfaceDemo{
	public static void main (String[] arg){
		C obc=new C();
		obc.method1("Hi!");
		D obd = new D();
		obd.method1();
	}
}
interface Calculator{
	int add(int a, int b);
	int substract(int a, int b);
	int multiply(int a, int b);
	float divide(int a, int b);

}

class MyCalculator implements Calculator{
	public void method1(String s){
		System.out.println("From C: " + s);
	}
	
	public int add(int a, int b){
		System.out.println("MyCalculator performed addition operation " + a + "+" + b + "=" + (a+b));
		return a+b;
	}
	
	public int substract(int a, int b){
		System.out.println("MyCalculator performed substraction operation " + a + "-" + b + "=" + (a-b));
		return a-b;
	}
	
	public int multiply(int a, int b){
		System.out.println("MyCalculator performed multiplication operation " + a + "*" + b + "=" + (a*b));
		return a*b;
	}
	
	public float divide(int a, int b){
		System.out.println("MyCalculator performed division operation " + a + "/" + b + "=" + (a/b));
		return a/b;
	}
}



class MyCalculator1 implements Calculator {
	public void print(){
		System.out.println("Hi From MyCalculator1!");
	}
	
	public int add(int a, int b){
		System.out.println("MyCalculator1 performed addition operation " + a + "+" + b + "=" + (a+b));
		return a+b;
	}
	
	public int substract(int a, int b){
		System.out.println("MyCalculator1 performed substraction operation " + a + "-" + b + "=" + (a-b));
		return a-b;
	}
	
	public int multiply(int a, int b){
		System.out.println("MyCalculator1 performed multiplication operation " + a + "*" + b + "=" + (a*b));
		return a*b;
	}
	
	public float divide(int a, int b){
		System.out.println("MyCalculator1 performed division operation " + a + "/" + b + "=" + (a/b));
		return a/b;
	}
	
}

public class InterfaceCalculatorDemo{
	public static void main (String[] arg){
		MyCalculator mc=new MyCalculator();
		MyCalculator1 mc1=new MyCalculator1();
		
		mc.add(5,6);
		mc.divide(8,3);
		
		mc1.add(2,5);
		mc1.divide(12,5);
	}
}
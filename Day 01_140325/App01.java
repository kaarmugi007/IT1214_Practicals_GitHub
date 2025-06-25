class One{
	int a=10;//variable definition
	int b;//variable declaration
	
	void printDetails(){//method
		System.out.println("From class One a = "+a);
		System.out.println("From class One b = "+b);
	}
}

class Two{
	int a,c;//declaration only
	
	void printDetails(){//method
		System.out.println("From class Two a = "+a);
		System.out.println("From class Two c = "+c);
	}
}

class App01{
	public static void main(String[] args){
		One o1=new One();
		o1.b=20;
		Two t1=new Two();
		t1.a=15;
		t1.c=25;
		o1.printDetails();
		t1.printDetails();
	}
}
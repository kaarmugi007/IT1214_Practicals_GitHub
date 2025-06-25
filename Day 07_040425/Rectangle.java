class Rectangle{
	
	private int height=2;
	int width=2;
	
	Rectangle(){
		height=2;
		width=2;
	}
	
	Rectangle(int height, int width){
		this.height=height;
		this.width=width;
		System.out.println("Just Created a rectangle object with size (h*w) " + height + ("*") + width);
		print(height,width);
	}
	
	void get_details(){
		System.out.println("Height " + height + ", width " + width);
		
	}
	
	void print(int height, int width){
		for (int i = 0; i<height; i++){//for number of rows i.e. height
		
			for(int j=0; j<width; j++){//for number of columns i.e. width
				System.out.print("*"); //number of * in a row
			}
			
			System.out.println(); //break lines
		}
	}
}

class Main{
	public static void main(String[] args){
		/*for(int i=0; i<10; i++){
			System.out.println("Value of i is " + i );
		}*/
		
		Rectangle r1=new Rectangle(5,3);
		Rectangle r2=new Rectangle();
		//r1.height=10;
		r1.width=20;
		Rectangle r3=r1;
		
		r1.get_details();
		r2.get_details();
		r3.get_details();
		
		/*System.out.println("r1:Height " + r1.height + ", width " + r1.width);
		System.out.println("r2:Height " + r2.height + ", width " + r2.width);
		System.out.println("r3:Height " + r3.height + ", width " + r3.width);
		*/
		

		

	}
}


/*Expected output 

***
***
***
***

*/
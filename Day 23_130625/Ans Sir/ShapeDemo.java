class Shape{
	double area;
	String name;
	//double findArea();	
	Shape(String name){
		this.name=name;
	}
}

class Rectangle extends Shape {
	double length, width;
	
	Rectangle(double length, double width){
		super("Rectange");
		this.length=length;
		this.width=width;
		findArea();
	}
	double findArea(){
		super.area = length*width;
		return area;
	}
}

class Circle extends Shape {
	double radius;
	Circle(){
		super("Circle");
	}
	double findArea(){
		super.area= Math.PI*Math.pow(radius,2);
		return area;
	}
}

public class ShapeDemo{
	public static void main(String[] ar){
		Rectangle r1= new Rectangle(5,4);
		System.out.println("Name of the Shape  r1 is : "+r1.name);
		System.out.println("Area of the Shape  r1 is : "+r1.area);
		
	}
}
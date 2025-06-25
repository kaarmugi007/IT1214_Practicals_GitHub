abstract class Shape{ //2D shape
	double area;
	double perimeter;
	abstract double findArea();
	
}

class Rectangle extends Shape{
	double length, width;
	
	Rectangle (double length, double width){
		this.length=length;
		this.width=width;
		findArea();
	}
	
	double findArea(){
		super.area = length*width;
		return super.area;
	}
}

class Circle extends Shape{
	double radius;
	
	Circle (double radius){
		this.radius=radius;
		findArea();
	}
	
	double findArea(){
		super.area = Math.PI*Math.pow(radius,2);//(22/7)*radius*radius OR Math.PI*radius*radius OR Math.PI*Math.pow(radius,2)
		return super.area;
	}
}

public class ShapeDemo{
	public static void main(String[] arg){
		Rectangle r1=new Rectangle(11,7);
		System.out.println("Area of Rectangle r1 is " + r1.area);
		System.out.println("Area of Rectangle r1 is " + r1.findArea());

		
		Circle c1=new Circle(4);
		System.out.println("Area of Circle c1 is " + c1.area);
		System.out.println("Area of Circle c1 is " + c1.findArea());
		
		
	}
}
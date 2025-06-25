/*
Type conversion and Type Casting

boolean
byte
short
char
int
long
float
double
String

*/

class ConverterDemo{
	public static void main(String[] args){
		boolean bo = true;
		byte by =  10; //-128 to 127
		short sh = 45;
		char ch = 'a';
		int in = 456;
		long lo = 452;
		float fl = 7.1245f; //have to mention 'f' otherwise it will consider it as a double and show error OR 89/4 but 89.8/5 won't work
		double db = 78.45;
		String st = "Hi";
		
		lo =  by; //Type conversion
		
		sh = (short)lo; //Type casting
		
		fl = in; //no error , the value will become 456.0
		
		in =(int)db; //casting & the value will become 78
		in = 100;
		
		in =(char)ch;//no errors, will give the ASCII value of that charecter.The ASCII value for the lowercase letter "a" is 97.
		
		ch = 100; // will give the charecter of ASCII value 100. lowercase letter "d"
		
		System.out.println("Value of boolean b is: " + bo);
		System.out.println("Value of byte by is: " + by);
		System.out.println("Value of short s is: " + sh);
		System.out.println("Value of charecter c is: " + ch);		
		System.out.println("Value of int i is: " + in);
		System.out.println("Value of long l is: " + lo);
		System.out.println("Value of float f is: " + fl);
		System.out.println("Value of double d is: " + db);
		System.out.println("Value of String s is: " + st);
		
		
	}
}

		//lo =  by; widening , but by = lo; won't possible as ther is a possiblity lossy conversion from long to byte
		//sh = lo; shortening, won't complie. As there is possiblity lossy conversion from long to short
		
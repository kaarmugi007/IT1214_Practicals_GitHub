import it.*;
import it.hons.*;
//import p1.MyClass;
//import p2.MyClass2;
//import p2.MyClass3;
import amc.*; //import all the classes


class App{
	public static void main(String[] ar){
		it.FirstYear fyit=new it.FirstYear();
		fyit.display();
		
		amc.FirstYear fyamc=new amc.FirstYear();
		fyamc.display();
		
		SecondYear syamc=new amc.SecondYear();
		syamc.display();
		
		FourthYear itHons=new FourthYear();
		itHons.display();
	}
}
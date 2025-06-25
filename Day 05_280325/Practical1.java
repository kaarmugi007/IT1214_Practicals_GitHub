class Paper{ //class's name should starts with a capital letter
	int length; //int length,width;
	int width;
	String text;
	
}// you can't complile a class without a main method

class Document{
	String name;
	Paper p;
	
	public static void main(String[] args){
		Document d=new Document();
		System.out.println("Created a Document Object d");
		d.name="My First Document";
		System.out.println("Name of the Document d is " +d.name);
		//d.p=new Paper();
		//d.p.text="This is the text in the paper of document My First Document";
		System.out.println("Size (l*w) of the paper Document d is "+d.p.length+"*"+d.p.width);
		
		Document d2=new Document();
		System.out.println("Created a Document Object d2");
		d2.name="My Second Document";
		System.out.println("Name of the Document d2 is " +d2.name);
	}
}
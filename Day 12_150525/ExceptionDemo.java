class ExceptionDemo{
	public static void main(String[] args){
		System.out.println("Start of the Program");
		int a=10;
		int b=1;
		try{
		int c=a/b;
		int d=Integer.parseInt(args[0]);
		}
		catch(Exception e){
			System.out.println("An error Occurred!");
			System.out.println("The error is " + e.getMessage());
		}
		System.out.println("End of the Program");
	}
}

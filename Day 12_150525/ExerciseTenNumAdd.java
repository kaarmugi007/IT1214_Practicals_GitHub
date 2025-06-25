//create a main class to input 10 integers from user input and
//find the sum of the ten integers.

class IntSum {
	public static void main (String[] args){
		int[] num = new int[10];
		int sum =0;
		for (int i=0; i<10; i++){
		try{
			
			//int [i] = args[i];
			int num1=Integer.parseInt(args[0]);
			
		}
		catch (Exception e) {
			System.out.println("An error Occurred!");
			System.out.println("The error is " + e.getMessage());
		}
		}
		
		for (int i=0; i<10;i++){
			sum+=num[i];
		}
			System.out.println("The sum is " + sum);
		
	}
}
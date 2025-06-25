import java.util.Scanner;
class GPA{

	float gradePoint(String grade){
		float gp =0;//grade point value
		
		/*if (grade.equals("A+") || grade.equals("A")) //comparing 2 strings string1.equals(string2);
			{
				gp = 4;
			} else {
				if (grade.equals("A-")){
					gp =  3.7f;
				}
			}
		*/
		
		switch (grade){
			case "A+":
				gp =4;
				break; 
			
			case "A":
				gp =4;
				break;
			
			case "A-":
				gp =3.7f;
				break;
			
			case "B+":
				gp =3.3f;
				break;
			
			case "B":
				gp =3;
				break;
			
			case "B-":
				gp =2.7f;
				break;
			
			case "C+":
				gp =2.3f;
				break;
			
			case "C":
				gp =2;
				break;
			
			case "C-":
				gp =1.7f;
				break;
			
			case "D+":
				gp =1.3f;
				break;
			
			case "D":
				gp =1;
				break;
			
			case "E":
				gp =0;
				break;
				
			default:
				gp = 0;
		};
		
		return gp;
	}

}

class Demo{
	static Scanner sc = new Scanner(System.in);
	static GPA g =  new GPA();
	static String name;
	static String subjects[]={"IT1113", "IT1122", "IT1134", "IT1144", "IT1152"};
	static int credits[]={3,2,4,4,2};
	
	static String[] grades=new String[5];
	static float[] gps=new float[5];
	//static int[] index=new int[5];
	
	 static float getPoint(String subjectCode, int credit, int index){
		System.out.println("Enter the Grade for " + subjects[index] + " : ");
		String grade= sc.nextLine();
		grades[index]=grade;
		gps[index]=g.gradePoint(grades[index])*credits[index];
		
		/*System.out.println("Grade point value of the grade " + grade + " is " + g.gradePoint(grade));
		System.out.println("Grade Point * credit is " + g.gradePoint(grade)*credit);*/
		
		return g.gradePoint(grade)*credit;
	}
	
	
	public static void main(String[] args){
		float ogp = 0; 
		
		System.out.print("Enter your Name: ");
		name = sc.nextLine();
		
		for (int i=0; i<5;i++){
			ogp+=getPoint(subjects[i],credits[i],i);
		}
		
		System.out.println("Name: " + name);
		System.out.println("-----------------------------------------");
		System.out.println("Subject Code	| Grade	| Grade Point	|");
		System.out.println("-----------------------------------------");
		
		for(int i=0; i<5;i++){
			System.out.println(subjects[i] + "\t\t| " + grades[i] + "\t| " + gps[i] + "\t\t| " );
			System.out.println("-----------------------------------------");
		}
		
		
		
		
		
		
		System.out.println("Overall Grade Point Average is " + ogp/15);
	}
	
	/*public static void main(String[] args){
		float ogp = 0; 
		String name;
		
		System.out.print("Enter your Name: ");
		name = sc.nextLine();
		System.out.println("Hi " + name);
		
		for (int i=0; i<5;i++){
			ogp+=getPoint(subjects[i],credits[i]);
		}
		
		ogp+=getPoint("IT 1113",3);
		ogp+=getPoint("IT 1122",2);
		ogp+=getPoint("IT 1134",4);
		ogp+=getPoint("IT 1144",4);
		ogp+=getPoint("IT 1152",2);
		
		System.out.println("Overall Grade Point Average is " + ogp/15);
	}*/
	
	
	/*public static void main(String[] args){
		String name;
		float ogp = 0; 
		String grade;
		float point = 0;
		
		Scanner sc = new Scanner(System.in);
		GPA g =  new GPA();
	
		
		System.out.print("Enter the Grade for IT 1113: ");
		grade=sc.nextLine();
		point = g.gradePoint(grade);
		ogp = ogp + point*3; //ogp += point*3;
		System.out.println("Grade point value of the grade " + grade + " is " + point);
		System.out.println("Overall Grade Point is " + ogp);
		
		System.out.print("Enter the Grade for IT 1122: ");
		grade=sc.nextLine();
		point = g.gradePoint(grade);
		ogp = ogp + point*2; 
		System.out.println("Grade point value of the grade " + grade + " is " + point);
		System.out.println("Overall Grade Point is " + ogp);
		
		System.out.print("Enter the Grade for IT 1134: ");
		grade=sc.nextLine();
		point = g.gradePoint(grade);
		ogp = ogp + point*4;
		System.out.println("Grade point value of the grade " + grade + " is " + point);
		System.out.println("Overall Grade Point is " + ogp);
		
		System.out.print("Enter the Grade for IT 1144: ");
		grade=sc.nextLine();
		point = g.gradePoint(grade);
		ogp = ogp + point*4;
		System.out.println("Grade point value of the grade " + grade + " is " + point);
		System.out.println("Overall Grade Point is " + ogp);
		
		System.out.print("Enter the Grade for IT 1152: ");
		grade=sc.nextLine();
		point = g.gradePoint(grade);
		ogp = ogp + point*2;
		System.out.println("Grade point value of the grade " + grade + " is " + point);
		System.out.println("Overall Grade Point is " + ogp);
		
		System.out.println("Overall Grade Point Average is " + ogp/15);
		
	}*/
}




/*
Name: 

-----------------------------------------
Subject Code	| Grade	| Grade Point	|
-----------------------------------------
IT 1113			| A 	| 4.0			|
-----------------------------------------

*/
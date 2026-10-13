import java.util.Scanner;
public class GradeClassifier{
	public static void main(String [] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your score: ");
		int score = scn.nextInt();
		
		String grade; 
		
		if(score >= 90 && score <= 100)
		{
			grade = "Grade A"; 
		}	
		else if(score >=80 && score <= 90)
		{
			grade = "Grade B";
		}
		else if(score >=60 && score <=80)
		{
			grade = "Grade C";
		}
		else if(score >=40 && score <=60)
		{
			grade = "Grade D";
		}		
		else if(score >=20 && score <=40)
		{
			grade = "Grade F";
		}
		else{
			grade = "Invalid score";
		}	
		
		System.out.println("The students grade is: " + grade);
	}
}
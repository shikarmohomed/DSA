import java.util.Scanner;
public class Calculator
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operator (+ , - , * , /): ");
		char opr =sc.nextLine().charAt(0);
		
		System.out.println("Enter your first number: ");
		int N1 = sc.nextInt();
		
		System.out.println("Enter your second number: ");
		int N2 = sc.nextInt();
		
		Calculator C1 = new Calculator();
		int result = C1.performOperation(opr , N1 ,N2);
		
		System.out.println("result: " + result);
	}
	
		public int performOperation(char opr , int N1 , int N2)
		{
			int result = 0;
			switch(opr){
				case '+':								
				result = N1 + N2;
				break;
			
				case'-':
				result = N1 - N2;
				break;
			
				case'*':
				result = N1 * N2;
				break;
			
				case'/':
				result = N1 / N2;
				break;
			
				default:
				System.out.println("Invalid operation");
				result = 0;
				break;
		}
		return result;	
	}
}
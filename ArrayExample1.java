public class ArrayExample1
{
	public static void main(String args[])
	{
		int[] arr = {10 , 24, 45 , 87 , 65};
		
		//traverse(visit every element)
		for(int i=0;i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		//Access
		System.out.println("Third element is: " + arr[2]);
	}
}
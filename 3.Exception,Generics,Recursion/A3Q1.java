import java.util.*;
class A3Q1{
	
	public static void main(String args[]){
			
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Lucky Number :");
		int n = sc.nextInt();
		try
		{
			if(n<0)
			{
				throw new NumberFormatException("NumberFormatException");
			}
			System.out.println("Your Lucky Number is "+n);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Not That Lucky !! Seems you encounter an Exception !!");
			System.out.println(e);
		}
	}
}

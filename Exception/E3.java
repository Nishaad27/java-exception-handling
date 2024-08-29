import java.lang.*;
import java.util.*;
class NegativeDimensionException extends Exception
{
	public String toString()
	{
		return "Dimensions cannot be Negative !";
	}
}
class E3
{
	static int area(int l,int b) throws NegativeDimensionException
	{
		if(l<0|| b<0)
		{
			throw new NegativeDimensionException();
		}
		int a = l*b;
		return l;
		
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length and breadth:");
		int l = sc.nextInt();
		int b =sc.nextInt();
		try
		{
			int z = area(l,b);
			System.out.println("Area: "+z);
			
		}
		catch(NegativeDimensionException e)
		{
			System.out.println(e);
		}
		
	}
}
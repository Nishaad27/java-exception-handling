import java.lang.*;
import java.util.*;
class E4
{
	public static void main(String args[])
	{
		int x = 10;
		int y = 0;
		try
		{
			int z = x/y;
			System.out.println(z);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("Bye");
	}
}
import java.lang.*;
import java.util.*;
class E2
{
	static void meth2(int x,int y) throws Exception
	{
		if(y == 0)
		{
			throw new Exception("Negative Denominator");
		}
		int z = x/y;
		System.out.println(z);
	}
	static void meth1(int x,int y) throws Exception
	{
		meth2(x,y);
	}
	public static void main(String args[])
	{
		try
		{
			meth1(10,0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
		
	
}
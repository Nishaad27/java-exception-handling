import java.lang.*;
import java.util.*;
class E1
{
	static void meth2(int x,int y)
	{
	   try
	   {
		 if(y ==0)
        {
			throw new Exception("Negative Denominator");
		}
		int z = x/y;
		System.out.println(z);
	   }
	   catch(Exception e)
	   {
		   System.out.println(e);
	   }
	}
	static void meth1()
	{
		meth2(10,0);
		
	}
	public static void main(String args[])
	{
		meth1();
	}
}
import java.io.*;
class main
{
	public static void main (String[] args) 
	{
		int a=10,b=10,c;
		try 
		{
		  c=a/b; 
		  System.out.println("exception in try");
		} 
		catch(ArithmeticException e) 
		{
		    System.out.println(e);
		}	
		catch(Exception e) 
		{
		    System.out.println("exception handled");
		}
	
	    finally
		{
		    System.out.println("finally block executed");
		}
		
		
	}
}

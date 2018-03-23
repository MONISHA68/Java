import java.util.*;
import java.lang.*;
class GFG 
{
	public static void main (String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    int count=0;
	    String str[]=s.split("\\s");
	   //System.out.println(str.length);
	    for(int i=0;i<str.length;i++)
	    {
	        count=0;
	     for(int j=str[i].length()-1;j>=0;j--)
	     {
	         count++;
	         if(count==str[i].length())
	         {
	             System.out.print(Character.toUpperCase(str[i].charAt(j)));
	         }
	         else
	         {
	             System.out.print(str[i].charAt(j));
	         }
	     }
	     System.out.print(" ");
	    }     
	}
}


//////////////////////////////////////////same problem with another method /////////////////////////
import java.util.*;
import java.lang.*;
class GFG 
{
	public static void main (String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    int count=0;
	    String str[]=s.split("\\s");
	   //System.out.println(str.length);
	    for(int i=0;i<str.length;i++)
	    {
	        count=0;
	     for(int j=str[i].length()-1;j>=0;j--)
	     {
	         count++;
	         if(count==str[i].length())
	         {
	             String b=String.valueOf(str[i].charAt(j));
	             System.out.print(b.toUpperCase());
	         }
	         else
	         {
	             System.out.print(str[i].charAt(j));
	         }
	     }
	     System.out.print(" ");
	    }     
	}
}

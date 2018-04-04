import java.util.*;
public class alpha{
    
 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String test=sc.nextLine();
		count(test);
		sc.close();
	}
	public static void count(String x){
		char[] ch = x.toCharArray();
		//System.out.print(ch.length);
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		for(int i = 0; i <ch.length; i++){
			if(Character.isLetter(ch[i])){
				letter ++ ;
			}
			else if(Character.isDigit(ch[i])){
				num ++ ;
			}
			else if(Character.isSpaceChar(ch[i])){
				space ++ ;
			}
			else{
				other ++;
			}
		}
		System.out.println(x);
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("other: " + other);
	}
	
}
///////////////////////////////////another method//////////////////////////////////////////
import java.util.*;
public class Alphanumeric
{
 public static void main (String[] args)
 { 
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] str=s.split("\\s");
		int count=0,count1=0,alpha=0,number=0,alphanumeric=0;
		for(int i=0;i<str.length;i++)
		{
			 count=0;
			 count1=0;
		     int n=str[i].length();	
		     for(int j=0;j<n;j++)
		     {
		    	 if(Character.isLetter(str[i].charAt(j)))
		    	 {
		    		 count++;
		         }
		    	 else if(Character.isDigit(str[i].charAt(j)))
		    	 {
		    		 count1++;
		    	 }
		     }
		     if(count==n)
		     {
		    	 alpha++;
		     }
		     else if(count1==n)
		     {
		    	 number++;
		     }
		     else
		     {
		    	 alphanumeric++;
		     }
		 }
		System.out.println("alphabets:"+alpha);
		System.out.println("numbers:"+number);
		System.out.println("alphanumeric:"+alphanumeric);
		sc.close();
	}
}

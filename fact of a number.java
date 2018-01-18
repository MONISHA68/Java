import java.util.Scanner;
class sample
{
	public static void main(String[] args)
	{
		int fact=1,i;
		int n;
		Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    for(i=1;i<=n;i++)
	    {
	        fact=fact*i;
	    }
	    System.out.println("factorial of a number:");
	    System.out.println(n+"="+fact);
	 }
}


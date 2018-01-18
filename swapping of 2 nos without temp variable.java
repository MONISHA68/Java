import java.util.Scanner;
class sample
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
	    a=sc.nextInt();
	    b=sc.nextInt();
	    a=a+b;
	    b=a-b;
	    a=a-b;
	    System.out.println("Swapping of 2 nos:");
	    System.out.println("a="+a);
	    System.out.println("b="+b);
	}
}


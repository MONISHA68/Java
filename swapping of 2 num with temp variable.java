import java.util.Scanner;
class sample
{
	public static void main(String[] args)
	{
		int a,b,temp,n;
		Scanner sc=new Scanner(System.in);
	    a=sc.nextInt();
	    b=sc.nextInt();
	    temp=a;
	    a=b;
	    b=temp;
	    System.out.println("Swapping of 2 nos:");
	    System.out.println("a="+a);
	    System.out.println("b="+b);
	}
}

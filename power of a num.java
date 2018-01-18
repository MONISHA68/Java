import java.util.Scanner;
class sample
{
	public static void main(String[] args)
	{
		int result=1,base,exp,i;
	  Scanner sc=new Scanner(System.in);
		base=sc.nextInt();
		exp=sc.nextInt();
		for(i=1;i<=exp;i++)
		{
			result=result*base;
			
		}
		System.out.println("Power of a number:");
		System.out.println(base+"^"+exp+"="+result);
	

	}

}


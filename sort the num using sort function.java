import java.util.Scanner;
import java.util.Arrays;
class sample
{
	public static void main(String[] args)
	{
		int n,i,j;
		int temp;
		Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    int[] a=new int[n];
	    for(i=0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    Arrays.sort(a);
	   System.out.println(a);
	  }
}

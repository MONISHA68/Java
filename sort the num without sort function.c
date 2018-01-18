import java.util.Scanner;
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
	    for(i=0;i<n;i++)
	    {
	        for(j=0;j<(n-i-1);j++)
	        {
	         if(a[j]>a[j+1])
	         {
	             temp=a[j];
	             a[j]=a[j+1];
	             a[j+1]=temp;
	         }
	        }
	    }
	    for(i=0;i<n;i++)
	    {
	       System.out.println("sorted array:"+a[i]);
	    }
	  }
}

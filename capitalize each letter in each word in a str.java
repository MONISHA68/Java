import java.util.Scanner;
class sample
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
	  StringBuilder result = new StringBuilder(str.length());
		String words[]=str.split("\\s");
		for(int i=0;i<words.length;i++)
		{
		    result.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");
		}
	    System.out.println(result);
	}
}

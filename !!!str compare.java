package javastrings.java;
import java.util.Scanner;
public class strcompare
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		//char[] ch1=s1.toCharArray();
		//char[] ch2=s2.toCharArray();
		//System.out.print(ch1.length);
		//System.out.print(ch2.length);
		int n1=s1.length();
		int n2=s2.length();
		int count=0;
		int res=strcmp(s1,s2);
		System.out.print(res);
		sc.close();
	}
}

package javastrings.java;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//String[] str=sc.nextLine().split(" ");
		String s1=sc.nextLine();
		int n=Integer.parseInt(s1);
		String str[]=new String[n];
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();
		}
		char t=' ';
		int p=0;
		int[] index= new int[str.length];
		String[] words=new String[str.length];
		/*for(int i=0;i<str.length;i++)
		{
			words[i]=str[i];
			//System.out.println(words[i]);
		} */
		
		words=str.clone();//copying array
		//System.out.println(words+"*");
		for(int i=0;i<n;i++)
		{
			index[p++]=i;
			char[] ch=words[i].toCharArray();
			for(int j=0;j<ch.length-1;j++)
			{
				for(int k=j+1;k<ch.length;k++)
				{
					if(ch[j]>ch[k])
					{
						t=ch[j];
						ch[j]=ch[k];
						ch[k]=t;
					}
				}
			}
			words[i]=String.valueOf(ch);
		}
		String temp="";
		int ind=0;
		for(int i=0;i<words.length-1;i++)
		{
			for(int j=i+1;j<words.length;j++)
			{
				if(words[i].compareTo(words[j])>0)
				{
					temp=words[i];
					ind=index[i];
					words[i]=words[j];
					index[i]=index[j];
					words[j]=temp;
					index[j]=ind;
				}
			}
		}
		int x=0;
		for(int i=0;i<p;i++)
		{
			x=index[i];
			System.out.print(str[x]+" ");
		}
		sc.close();
	}
}

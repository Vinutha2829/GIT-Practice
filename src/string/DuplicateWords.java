package string;

import java.util.Scanner;

public class DuplicateWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String s1=toRemoveSpecialCase(s);
		System.out.println("String after remove SpecialCharacter:"+s1);
		char[] c=toArray(s1);
		c=ascendOrder(c);
		System.out.println();
		duplicateWord(c);
		}
	public static char[] toArray(String s)
	{
		char[] c=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			c[i]=s.charAt(i);
		}
		c=toLowerCase(c);
		return c;
	}
	public static char[] toLowerCase(char[] c)
	{
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='A'&&c[i]<='Z')
			{
				c[i]=(char)((int)c[i]+32);
			}
		}
		return c;
	}
	public static char[] ascendOrder(char[] c)
	{
		char tmp;
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					tmp=c[i];
					c[i]=c[j];
					c[j]=tmp;
				}
			}
		}
		System.out.print("String in AscendingOrder:");
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
		}
		return c;
	}
	public static void duplicateWord(char[] c)
	{
		int count=1;
		int i=0;
		char s=' ';
		char s1=' ';
		for(int j=0;j<c.length-1;j++ )
		{
				s=c[i+j];
				 s1=c[j+1];
				if(s==s1)
				{
					count++;
				}
				else if(count>1)
				{
					System.out.println("word: "+ s+" count: "+ count);
					count=1;
				}
		}
		if(count>1)
		{
		System.out.println("word: "+ s1+" count: "+ count);
		}
		
	}
	public  static String toRemoveSpecialCase(String s)
	{
		String s1=" ";
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z'))
			{
				s1=s1+s.charAt(i);
			}
			
		}
		return s1;
	}

}

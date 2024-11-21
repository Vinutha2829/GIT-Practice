package string;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) 
		{
			methodCalling();
	}
	
		public static void methodCalling()
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String s1=sc.next();
		char[] f=getInput(s1);
		System.out.println();
		System.out.print("Enter the string:");
		String s2=sc.next();
		char[] s=getInput(s2);
		System.out.println();
		char[] fir=ascendOrder(f);
		System.out.println();
		char[] sec=ascendOrder(s);
		System.out.println();
		boolean flag=anagram(fir,sec);
		if(flag==true)
		{
		System.out.println("Two string are Anagram "+s1+" "+s2);
		}
		else
		{
			System.out.println("Two string are  not Anagram "+s1+" "+s2);
		}
		

	}
	public static char[] getInput(String s)
	{
		
		char[] f=new char[s.length()];
		for(int i=0;i<f.length;i++)
		{
			if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
			{
				f[i]=(char)((int)s.charAt(i)+32);
			}
			else
			{
			f[i]=s.charAt(i);
			}
		}
		System.out.println();
		System.out.print("Printing charArray:");
		return printArray(f);
	}
	
	public static char[] printArray(char[] p)
	{
	
		for(int i=0;i<p.length;i++)
		{
			System.out.print(p[i]);
		}
		return p;
	}
	public static char[] ascendOrder(char[] a)
	{
		System.out.print("Ascending order:");
		char temp;
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		printArray(a);
		return a;
	}
	public static boolean anagram(char[]fir,char[]sec)
	{
		int n=fir.length;
		boolean flag=true;
		if(fir.length!=sec.length)
		{
			flag=false;
		}
		for(int i=0;i<n;i++)
		{
			if(fir[i]!=sec[i])
			{
				flag=false;
			}
		}
		return flag;
		
	}

}

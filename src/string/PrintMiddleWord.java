package string;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintMiddleWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		ArrayList a=new ArrayList();
		String s1=" ";
		for(int i=0;i<s.length();i++)
		{
			if(!((s.charAt(i)==' ')||(s.charAt(i)=='_')||(s.charAt(i)=='@')||(s.charAt(i)=='$')))
			{
				s1=s1+s.charAt(i);
			}
			else
			{
				a.add(s1);
				s1=" ";
			}
		}
		a.add(s1);
			System.out.println("Displaying size of arrayList: "+a.size());
			System.out.println("Printing lists: ");
			for(int i=0;i<a.size();i++)
			{
				System.out.println(a.get(i));
			}
				System.out.println("Printing middle word in a list:"+a.get(a.size()/2-1));
	}

}

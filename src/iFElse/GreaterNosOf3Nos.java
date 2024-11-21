package iFElse;

import java.util.Scanner;

public class GreaterNosOf3Nos {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 3 nos");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("A is Greater:"+ a);
		}else if(b>c)
		{
			System.out.println("B is Greater:"+ b);
		}else
		{
			System.out.println("C is Greater:"+ c);
		}

	}

}

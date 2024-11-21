package iFElse;

import java.util.Scanner;

public class NosPostiveOrNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int nos=sc.nextInt();
		if(nos>0&nos==0)
		{
			System.out.println("Postive Number:" +nos);
		}else if(nos==0)
		{
			System.out.println("Netural Number:" +nos);
		}
		else
		{
			System.out.println("Negative Number:" +nos);
		}
		

	}

}

package sswitch;

import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
		int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character :");
		char c=sc.next().charAt(0);
		
		switch(c)
		{
		case 'a':
			i++;
			break;
		case 'e':
			i++;
			break;
		case 'i':
			i++;
			break;
		case 'o':
			i++;
			break;
		case 'u':
			i++;
			break;
			default:
				System.out.println("Constents: "+c);
				break;
		}
		if(i!=0)
		{
			System.out.println("Vowels: "+c);
		}

	}

}

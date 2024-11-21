package iFElse;
import java.util.Scanner;
public class OddOrEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Nos");
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Even Nos:" +n);
		}
		else
		{
			System.out.println("Odd Nos:" +n);
		}

	}

}

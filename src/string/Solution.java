package string;

	import java.util.ArrayList;
import java.util.Scanner;

	public class Solution {
		public static void main(String[] args)
		{
	    	Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        int count=0;
	        ArrayList a=new ArrayList();
	        for(int i = 0; i <s.length();i++) 
	        {
	            if(s.charAt(i)==' '||s.charAt(i)==','||s.charAt(i)=='?'||s.charAt(i)=='`') 
	            {
	                System.out.println();
	            count++;
	                continue;
	            }
	            System.out.print(s.charAt(i));
	        }
	             
	    }
	}
	
	


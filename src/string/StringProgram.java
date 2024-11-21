package string;

public class StringProgram {

	public static void main(String[] args) {
		//Reverse a string:
		String name="vinutha";
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		
	}

}

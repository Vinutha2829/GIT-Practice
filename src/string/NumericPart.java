package string;

public class NumericPart {

	public static void main(String[] args) {
		String s="your transaction id is: 12345 and reference id is 34567";
		String s1=" ";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&&s.charAt(i)<='9')
			{
				s1=s1+s.charAt(i);
				
			}
		}
		System.out.println(s1);

	}
    
}

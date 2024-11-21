package string;

public class AscendingOrder {

	public static void main(String[] args) {
		String s="vinutha";
		//char[] c=s.toCharArray();
		char[] c=new char[s.length()];
		for(int i=0;i<c.length;i++)
		{
			c[i]=s.charAt(i);
		}
		System.out.print("Before sorting order:");
		printArray(c);
		sortArray(c);
		
		}
	public static void sortArray(char[] c)
	{
		char temp=' ';
		int n=c.length;
		
		for(int i=0;i<n;i++)
			{
			
				for(int j=i+1;j<n;j++)
				{
					
					if(c[i]>c[j])
					{
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
					
					}
					
				}
				
				
			}
		System.out.print("After sorting order:");
		printArray(c);
	}
	public static void printArray(char[] c)
	{
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
		}
		System.out.println();
	}
}

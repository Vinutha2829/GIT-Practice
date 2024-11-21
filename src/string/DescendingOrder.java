package string;

public class DescendingOrder {

	public static void main(String[] args) {
		String s="madhan";
		int n=s.length();
		char[] c=new char[n];
		for(int i=0;i<n;i++)
			{
				c[i]=s.charAt(i);
			}
		System.out.print("Before sorting:");
		printArray(c);
		descendOrder(c);


	}
	public static void descendOrder(char[]c)
	{
		char temp;
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]<c[j])
				{
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		System.out.print("After sorting:");
		printArray(c);
	}
	public static void printArray(char[]c)
	{
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
		}
		System.out.println();
	}

}

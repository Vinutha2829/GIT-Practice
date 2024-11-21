package patterns;

public class Left_Triangle {
	public static void left_Triangle(int n)
	{
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(j<n-i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args)
	{
		int n=5;
		left_Triangle(n);
	}

}

package array;
public class Sorting {
public static void main(String[] args) {
	int[] a= {33,4,0,44,10,40,3,6,77};
	int n=a.length;
	int temp=0;
	System.out.println("Ascending Order");
	for(int i=0;i<n-1;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(Integer e:a)
	{
		System.out.println(e);
	}
	System.out.println("Descending Order");
	int[] b= {33,4,0,44,10,40,3,6,77};
	int m=b.length;
	for(int i=0;i<m-1;i++)
	{
		for(int j=i+1;j<m;j++)
		{
			if(b[i]<b[j])
			{
				temp=a[i];
				b[i]=b[j];
				b[j]=temp;
			}
		}
	}
	for(Integer e:b)
	{
		System.out.println(e);
	}
	}

}

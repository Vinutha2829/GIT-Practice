package array;
public class MaxAndMinValue {
public static void main(String[] args) {
		int[] a= {70,20,2,500,1,55};
		int max=a[0];
		int min=a[0];
		int sec=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				sec=max;
				max=a[i];
			}
			else if(a[i]<min)
			{
				min=a[i];
			}
			else if(a[i]>sec&&a[i]!=max)
			{
				sec=a[i];
			}
		}
		System.out.println("Max: "+max+" Min: "+min+" sec: "+sec);

	}

}

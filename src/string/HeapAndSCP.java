package string;

public class HeapAndSCP {

	public static void main(String[] args) {
		String s=new String("you cannot change me");
		String s1=new String("you cannot change me");
		String s2="you cannot change Me";
		String s3="YOU CANNOT CHANGE mE";
		String s4="you cannot change ME";
		System.out.println(s2==s3);
		System.out.println(s2==s4);
		System.out.println(s2==s4);

	}

}

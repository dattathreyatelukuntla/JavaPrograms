package Programs;
import java.util.Scanner;

public class ReverseNumber {
	static int n,rev=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		n=sc.nextInt();
		while(n!=0)
		{
			rev=rev*10;
			rev=rev+n%10;
			n=n/10;
		}
		System.out.println(rev);
		
	}

}

import java.util.Scanner;

public class beg100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of element");
		int n=sc.nextInt();
		int product=1;
		for(int i=1;i<=n;i++)
		{
			product=product*i;
		}
		System.out.println("output "+product);

	}

}

import java.util.Scanner;

public class Big {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a>b&&a>c)
		{
		System.out.println("the biggest number is "+a);
		}
		else if(b>a&&b>c)
		{
		System.out.println("the biggest number is "+b);
		}
		else(c>b&&c>a)
		{
		System.out.println("the biggest number is "+c);
		}
		

	}

}

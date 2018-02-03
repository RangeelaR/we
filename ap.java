import java.util.Scanner;

public class ap {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first element");
		int a=sc.nextInt();
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("enter the difference");
		int d=sc.nextInt();
		int b=a+(n-1)*d;
		int sum=(n/2)*(a+b);
		System.out.println("result is"+sum);
	}

}

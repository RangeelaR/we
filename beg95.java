import java.util.Scanner;

public class beg95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the principal");
		int p= sc.nextInt();
		System.out.println("enter the no of years");
		int n= sc.nextInt();
		System.out.println("enter the rate of interest");
		int r= sc.nextInt();
		int a=(p*n*r)/100;
		System.out.println("result : "+a);

	}

}

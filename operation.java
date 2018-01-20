import java.util.Scanner;

public class operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double r=(a^b)%c ;
		System.out.println(r);
	

	}

}

import java.util.Scanner;

public class beg91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the length");
		int l=sc.nextInt();
		System.out.println("enter the height");
		int b=sc.nextInt();
		System.out.println("enter the width");
		int h=sc.nextInt();
		int t=2*((l*b)+(b*h)+(l*h));
		int v=l*b*h;
		System.out.println("Total surface area"+t);
		System.out.println("volume"+v);

	}

}

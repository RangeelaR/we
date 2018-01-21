import java.util.Scanner;

public class factor {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		int m = sc.nextInt();
		int s=1;
		for(int i=1;i<=m;i++)
		{
			s=s*i;
		}
		System.out.println(s);
	}
	}

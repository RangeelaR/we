import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		int m = sc.nextInt();
		int sum=0;
		for(int i=1;i<=m;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
	}

import java.util.Scanner;

public class odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two values for interval");
		int m = sc.nextInt();
		int n = sc.nextInt();
		if(m%2!=0)
		{
		for(int i=m;i<n-2;i++)
		{
			m=m+2;
			System.out.println(m);
			i++;
		}
		}
		else
		{
			for(int i=m;i<n-2;i++)
			{
				m=m+1;
				System.out.println(m);
				m++;
			}
			}

	}

}

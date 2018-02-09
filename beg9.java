import java.util.Scanner;

public class beg9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int m = sc.nextInt();
    int sum=0;
	int a[]=new int[m];
  System.out.println("enter the size");
		int n = sc.nextInt();
		for(int i=1;i<m;i++)
		{
			a[i]=sc.nextInt();
		}
    for(int i=1;i<n;i++)
		{
			sum=sum+a[i]
		}
		System.out.println(sum);
	}
}

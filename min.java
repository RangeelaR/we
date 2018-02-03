import java.util.Scanner;

public class min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of element");
		int n=sc.nextInt();
		System.out.println("enter the  element");
		int[] a=new int[n];
		int i, c=0;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(a[0]<a[i])
			{
				a[0]=a[0];
			
			}
			else
			{
				a[0]=a[i];
			}
		}
		System.out.println("element"+a[0]);
		
		

	}

}

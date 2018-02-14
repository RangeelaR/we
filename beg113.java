import java.util.Scanner;

public class beg113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of element");
		int n=sc.nextInt();
		System.out.println("enter the  element");
		int[] a=new int[n];
		int ba=0;
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();

	}
		System.out.println("enter the check number");
		int n1=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==n1)
			{
				ba++;
	
			}

	}
		System.out.println("enter the no of element"+ba);

	}

}

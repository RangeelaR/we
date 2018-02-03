import java.util.Scanner;

public class index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of element");
		int n=sc.nextInt();
		System.out.println("enter the number");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("output");
		for(int i=0;i<n;i++)
		{
			if(a[i]==i)
			{
				System.out.print(a[i]);
			}
			
		}


	}

}

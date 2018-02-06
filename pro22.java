import java.util.Scanner;

public class  pro22{

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
     for (int i = 0; i < n; i++) 
	        {
	            for (int j = i + 1; j < n; j++) 
	            {
	                if (a[i] > a[j]) 
	                {
	                    temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }
       int b=a[n-1]+a[n-2] ; 
     System.out.println("the maximum sum of the  number"+b);     

import java.util.Scanner;

public class set15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int i, c=0;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
			c=c+a[i];
			}
	
			System.out.print(c);
		

	}

}

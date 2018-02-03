import java.util.Scanner;

public class median {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, temp;
		double med;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
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
        
        if(n%2!=0)
        {
        	int r=(n+1)/2;
            
            System.out.print("median:"+a[r-1]);
        }
        if(n%2==0)
        {
        	int r=(n)/2;
            int m=(a[r-1]+a[r]);
            med=m/2;
            System.out.print("median:"+med);
        }


	}

}

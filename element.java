import java.util.Scanner;

public class elementindex {

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
         
            System.out.println(a[i]+" "+i);
            
        }


	}

}

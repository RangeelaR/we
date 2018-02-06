import java.util.Scanner;

public class evenorodd {

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
    for(i=0;1<n;i++)
    {
    if(a[i]%2==0&& i%2!=0)
    {
    System.out.println("even no on odd position"+a[i]);
    }
    if(a[i]%2!=0&& i%2==0)
    {
    System.out.println("odd no on even position"+a[i]);
    }
    else
    {
     System.out.println("no number");
    }
    }

import java.util.Scanner;

public class beg29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
		System.out.println("enter the number of element");
int n=sc.nextInt();
int hr=n/60;
int min=n%60;
	System.out.println("output"+hr+":"+min);

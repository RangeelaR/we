
import java.util.Scanner;

public class binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		int m = sc.nextInt();
		if(m==1||m==0)
		{
			System.out.println(" 1");
		}
		if(m>=2&&m<=3)
		{
			System.out.println("2 ");
		}
		if(m>=4&&m<=7)
		{
			System.out.println(" 3");
		}
		if(m>=7&&m<=15)
		{
			System.out.println(" 4");
		}
		if(m>=16&&m<=31)
		{
			System.out.println(" 5");
		}
		if(m>=32&&m<=63)
		{
			System.out.println(" 6");
		}
		if(m>=64&&m<=127)
		{
			System.out.println("7 ");
		}
		if(m>=128&&m<=255)
		{
			System.out.println(" 8");
		}
		if(m>=2562&&m<=511)
		{
			System.out.println(" 9");
		}
		if(m>=512&&m<=1000)
		{
			System.out.println("10 ");
		}
		if(m>1000)
		{
			System.out.println("over flow ");
		}
		

	}

}

import java.util.Scanner;

public class holiday {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the day ");
		String a=sc.nextLine();
		if(a.equalsIgnoreCase("sunday")||a.equalsIgnoreCase("saturday"))
		{
        System.out.println("holiday");
		}
		else 
		{
			System.out.println(" not holiday");
		}


	}

}

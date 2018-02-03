import java.util.Scanner;

public class dectobin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter the number ");
		 int s=sc.nextInt();
		 String b=Integer.toBinaryString(s);
		 System.out.println("the number "+b);
		 
		int w=b.indexOf("1");
		 System.out.println(w+1);
			

	}

}

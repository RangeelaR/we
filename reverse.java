import java.util.*;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
		
		System.out.println("enter ");
		int number=sc.nextInt();
		int temp = number;
		int mod,sum=0;
		
		while(temp != 0) {
			
			mod = temp % 10;
			
			temp = temp / 10;
			sum=sum+mod*mod;
			
			
			
		}
		System.out.println("enter "+sum);

	}

}

import java.util.Scanner;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		char ch =sc.next().charAt(0);
		int ascii =ch;
		if(ascii<=65||ascii<=90)
		{  
           System.out.println("ALPHABET");
		}
		else
		{
			System.out.println("not a alphabet " );
		}
		}
	}

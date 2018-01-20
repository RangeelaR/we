import java.util.Scanner;
public class Armstrong
 {

 public static void main(String[] args)
 {
  
  Scanner sc=new Scanner(System.in);
  System.out.println(" enter the number");
  int n=sc.nextInt();
  int a= n%10;
  int a1=a*a*a;
  int b=n%100;
  int bb=b/10;
  int b1=bb*bb*bb;
  int c=n/100;
  int c1=c*c*c;
  int arm=a1+b1+c1;
  System.out.println(n==arm?"armstrong number":"not armstrong number");  
  
  
 }

}

public class Prime {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  System.out.println(" enter the number");
  int n=sc.nextInt();
  while(n!=0)
  
  {
   double b=n%2;
   if(n==2||(n==3)||(n==5)||(n==7))
   {
    System.out.println(" prime"+n);
   }
   
   else if(b==0)
   {
    System.out.println("not prime"+n);
   }
   else
   {
   int c=n%3;
   int d=n%5;
   int e=n%7;
   System.out.println((c==0||d==0||e==0)?"notprime"+n:"prime"+n);

   }
   --n;
  }
 }

}

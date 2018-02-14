
public class beg109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  element");
		int[] a=new int[10];
		int i;
		for(i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
			if(a[0]<a[i])
			{
				a[0]=a[0];
			
			}
			else
			{
				a[0]=a[i];
			}
		}
		System.out.println("least element "+a[0]);
		

	}

}

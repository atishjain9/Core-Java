import java.util.Scanner;

class Add2Read 
{
	public static void main(String[] args) 
	{
	 int a,b,c;

	 Scanner sc=new Scanner(System.in);

	 System.out.print("Enter a no:");
	 a=sc.nextInt();

	 System.out.print("Enter another no:");
	 b=sc.nextInt();

	 c=a+b;

	 System.out.println("Result is:"+c);
	 System.out.printf("%d + %d = %d",a,b,c);
		
	}
}

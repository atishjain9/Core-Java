import java.util.Scanner;
class EvenOdd 
{
	public static void main(String[] args) 
	{
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		no=sc.nextInt();

		if(no%2==0)
           System.out.println("Its Even No...");
		else
		   System.out.println("Its Odd No...");

	}
}

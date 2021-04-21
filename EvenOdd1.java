import java.util.Scanner;
class EvenOdd1 
{
	public static void main(String[] args) 
	{
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no:");
		no=sc.nextInt();

		System.out.println(no%2==0?"Even":"Odd");

	}
}

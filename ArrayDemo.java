class ArrayDemo 
{
	public static void main(String[] args) 
	{
		int arr[]=new int[10]; //empty array

		int no[]={12,45,67,65,100,23,67,100,200,300,400};  //creating array with data

		for(int i=0;i<10;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("------------------------");

		for(int i=0;i<no.length;i++)
			System.out.println(no[i]);
	}
}

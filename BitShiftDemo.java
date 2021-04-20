class BitShiftDemo 
{
	public static void main(String[] args) 
	{
		int x=20;
		System.out.println("20 is:"+Integer.toBinaryString(x));

		x=x>>2;
		System.out.println("x>>2:"+Integer.toBinaryString(x));
		System.out.println("x>>2:"+x);

		int y=10;
		System.out.println("10 is:"+Integer.toBinaryString(x));
		y=y<<3;
		System.out.println("y<<3:"+Integer.toBinaryString(y));
		System.out.println("y<<3:"+y);

		int z=-100;
		z=z>>>2;
		System.out.println("z>>>2:"+Integer.toBinaryString(z));
		System.out.println("z>>>2:"+z);


		


		


	}
}

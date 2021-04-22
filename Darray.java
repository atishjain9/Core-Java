class Darray 
{
	public static void main(String[] args) 
	{
		double darr[][]=new double[5][4];
		int i,j;

     
	    for(i=0;i<5;i++) //to represent rows
		{
         for(j=0;j<4;j++)  //to represent columns
			{
   		     System.out.print(darr[i][j]+"  ");
			}
			System.out.println();
		}


		
	}
}

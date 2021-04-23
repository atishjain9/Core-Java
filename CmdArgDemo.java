class CmdArgDemo 
{
	public static void main(String[] args) 
	{
	 System.out.println("No of Arguments are:"+args.length);
     
	 System.out.println("List of Arguments are:");
	 System.out.println("-----------------------");
     for(String s:args)
		 System.out.println(s);
	}
}

class First10PrimeWithMethod
{
	static int num =2;
	public static void main(String[] args) 
	{
		int count =0;
		// for (int i =1 ;count !=10 ;i++ ) 
		while(count<10)
		{
			if (prime()) 
			{
				System.out.println(num + " ");
				count++ ;
			}
			num++;
			
		}
	}
	public static boolean prime()
	{
		boolean flag = true;
		for (int i =2;i<num ;i++ ) 
		{
			if (num%i==0) 
			{
				flag =false;
				break;
			}
			
		}
		return flag;
	}

}
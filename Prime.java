class Prime
{
	public static void main(String args[])
	{
		int temp=1;
		int a=3;
		System.out.println("Prime numbers are whole numbers from 1");
		
		
		
	    for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				System.out.println(a+" is not a prime number");
				 temp=0;
				break;
			}
				
		}
		if(a==1)
		{
			System.out.println("1 is not prime and not composite  ");
		}
		else
		
		   {
			if(temp==1)
		     {
			    System.out.println(a+" is a prime number");
		     }
		   }
		
			
	}
}
//OUTPUT
//Prime numbers are whole number from 1
// 3 is a prime number

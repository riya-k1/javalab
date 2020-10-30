class Amstrong
{
	public static void main(String args[])
	{
		int num=371,sum=0,OG;
		OG=num;
		while (num!=0)
		{
			int eachdigit=num%10;
		    eachdigit=eachdigit*eachdigit*eachdigit;
			sum=sum+eachdigit;
			num=num/10;
		}
		if(OG==sum)
		{
			System.out.println(OG+" is an armstrong number");
		}
		else
		{
			System.out.println(OG+"is not an armstrong number");
		}
		
	}
}

//OUTPUT
// 371 is an amstrong number
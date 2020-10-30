class Palindrome
{
	public static void main(String args[])
	{
		int num=1221,reverse=0,reminder,OGnum;
		OGnum=num;
		while(num!=0)
		{
			reminder=num%10;
			reverse=reverse*10+reminder;
			num=num/10;
		}
		if (OGnum==reverse)
		{
			System.out.println(OGnum+" is a palindrome");
		}
		else
		{
		 	System.out.println(OGnum+" is not a palindrome");
		}
	}
}
//oUTPUT
// 1221 is a palindrome
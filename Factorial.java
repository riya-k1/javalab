class Factorial
{
   static int  fact(int n)
    {  if (n>1)
		{
	       return n*fact(n-1);
		}
	   else
		   return 1;
    }

	public static void main(String args[])
	{
		int n=10;
		System.out.println("Factorial: "+n+"! ="+fact(n));
		
	}

}
/* OUTPUT
Factorial: 10! =3628800
*/
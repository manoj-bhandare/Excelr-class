public class W
{
	static void test(String...varArg)
	{ 
		//by default var-arg is an array
		//iterating an array by using for-each loop
		for(String s1 : varArg)
		{
			if (varArg[0] == 0)
			{
				System.out.print(s1);
			}
			else
			{
				System.out.println("" + s1);
			}
			
		}
	}
	public static void main(String [] args)
	{
		test();
		test("abc");
		test("hello","test");
		test("hello","test","xyz");
		test("hello","test","xyz","abc");
	}
}

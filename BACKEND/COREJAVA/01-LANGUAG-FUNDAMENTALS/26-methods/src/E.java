class E 
{
	public static void test() // public is a access specifier 
	{
		System.out.println("from test");
	}
	public static void main(String [] args)
	{
		System.out.println("from main begin");
		test();
		System.out.println("from main end");
	}
}

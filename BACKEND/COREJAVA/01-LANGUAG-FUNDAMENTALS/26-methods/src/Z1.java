class Z1
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 12 - 4 * 2; // operator presidence //BODMAS
		System.out.println(i);
		System.out.println("main end");
	}
	static int test()
	{
		System.out.println("from test");
		return 100;
	}
}

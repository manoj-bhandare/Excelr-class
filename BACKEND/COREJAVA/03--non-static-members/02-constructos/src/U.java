class U
{
	U()
	{
		U(10);
		System.out.println("U()");
	}
	
	U(int i)
	{
		System.out.println("U(int)");
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		U u1 = new U();
		System.out.println("-------");
		U u2 = new U(10);
		System.out.println("-------");
		System.out.println("main end");
	}

}
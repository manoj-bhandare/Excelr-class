class E 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		tet1();
		System.out.println("main end");
	}
		public static void test1()
	{
		System.out.println("from test1 begin ");
		if (true)
		{
			for (int i = 1; 1 <= 2; i++)
			{
				int j = 0;
				while (j <= 1)
				{
					int k = 10;
					do
					{
						System.out.println("from do-while body");
						k++;
					}
					while ( k <= 12);
					j++;
				}
			}
		}
	}
}

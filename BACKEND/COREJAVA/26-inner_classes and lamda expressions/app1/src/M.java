class M
{
	public static void main(String[] args) 
	{
		class A
		{
			void test()
			{
				System.out.println("from A");
				System.out.println("from A");
				System.out.println("from A");
				System.out.println("from A");
			}
		}
		A a1 = new A();
		a1.test();
		a1.test();
		a1.test();
		System.out.println("done");
	}
}

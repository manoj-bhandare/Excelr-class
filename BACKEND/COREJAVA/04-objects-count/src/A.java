class A
{
	static int x; //static members can be accessed without any reference 

	A()
	{
		x += 10;
	}

	{
		x += 20;
	}

	void test1()
	{
		x += 30;
	}

	static void test2() //all the static members are part of each and every object of a class
	{
		x += 40;
	}
	// all the static members belong to each and every object of a class 

	public static void main(String[] args)
	{
		System.out.println("A: " + x);
		A a1 = new A();
		System.out.println("B: " + x);
		a1.test1();
		System.out.println("C: " + x);
		a1.test2(); // A.test2()
		System.out.println("D: " + x);
	}


}

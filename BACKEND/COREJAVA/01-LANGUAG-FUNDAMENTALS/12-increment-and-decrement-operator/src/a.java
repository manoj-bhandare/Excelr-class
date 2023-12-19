class A 
{
	public static void main(String[] args) 
	{
		int i= 0;
		//the value remains same for the immediate usage, from next usage modified value will be visible // i= i+1; 
		System.out.println(i++);// 0
		System.out.println(i);//1
		System.out.println(i);//1
	}
}
/*unary operator
1.Increment ++ var[post-increment] | [pre-increment]var
2.Decrement -- var[post-decrement] | [pre-decrement]var
*/
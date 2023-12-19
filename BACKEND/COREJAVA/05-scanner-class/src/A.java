import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		System.out.println("enter your first name");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("welcome: "+ name);
	}
}

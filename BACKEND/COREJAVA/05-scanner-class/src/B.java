import java.util.Scanner;
class B
{
	public static void main(String[] args) 
	{
		System.out.println("enter your full name");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("welcome: "+ name);
	}
}

//nextline() -  reads the complete line including any no.of spaces

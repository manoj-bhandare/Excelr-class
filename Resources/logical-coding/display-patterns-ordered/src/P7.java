/*
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
5 4 3 2 1
*/

class P7
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 5; j >= 1; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

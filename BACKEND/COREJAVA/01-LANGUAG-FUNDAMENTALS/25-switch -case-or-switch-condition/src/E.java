class E
{
	public static void main(String[] args) 
	{
		int i = 5;
		switch(i)//byte, short, int, char, string, enum type
		{
		case 2:
				if(true)
				{
					System.out.println("from case 2");
				}
			break;
		case 3:
				for(int j = 1; j <= 5; j++)
				{
					System.out.println("from case 3:" + j);
				}
			break;
		case 5:
			int k = 10;
			while (k <= 15)
			{
				System.out.println("from case 5: " + k);
				k++;
			}
			break;
		}
	}
}

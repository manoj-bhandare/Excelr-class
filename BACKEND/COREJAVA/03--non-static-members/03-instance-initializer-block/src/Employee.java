class Employee 
{
	String employeeName, companyName;
	int rollNum;
	double age;
	
	Employee(String employeeName, int rollNum, double age)
	{
		this.employeeName = employeeName;
		this.rollNum = rollNum;
		this.age = age;
	}
	{
		this.companyName = " xyz" ;
	}

	public static void main(String[] args) 
	{
		Employee emp1 = new Employee("john", 101, 32);
		System.out.println("----------");
		Employee emp2 = new Employee("sharma", 102, 30);
		System.out.println("----------");
		Employee emp3 = new Employee("akash", 103, 25);
		System.out.println("----------");
		Employee emp4 = new Employee("amit", 104, 23);
		System.out.println("-----------");
	}
}

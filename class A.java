class A
{
	private void show()
	{
		System.out.println("A class");
	}
	
	void print()
	{
		System.out.println("print() method");
	}
}


class Main extends A
{
	  void show()
	{
		System.out.println("Main class");
	}
	
	void display()
	{
		System.out.println("display() method");
	}
	
	public static void main(String[] args)
	{
	   Main obj = new Main();
		obj.show();
		obj.print();
		//obj.display();
		
	}
}


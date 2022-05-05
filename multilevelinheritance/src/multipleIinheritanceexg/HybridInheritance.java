package multipleIinheritanceexg;

public class HybridInheritance {

	interface one
	{
		int a=10;
		
	}
	interface two extends one
	{
		int b=20;
		
	}
	interface three
	{
		int c=30;
	}
	interface four extends two,three
	{
		int d=40;
		void display();
		
	}
	class test implements four{
		int e;
		public void display()
		{
			e=a+b+c+d;
			System.out.println("Sum is "+e);
		}
	}
	class inter
	{
		public void main(String args[])
		{
		test t=new test();
		t.display();
	}


	}




}

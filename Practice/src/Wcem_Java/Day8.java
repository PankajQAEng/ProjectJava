package Wcem_Java;

interface Test
{
	int a=10;//
	void display();
   default void method() 
	{
		System.out.println("pass");
	}
	
	static int method1() 
	{
		return 1;
	}

}






public class Day8 implements Test
{
	@Override
	public void display() 
	{
		System.out.println("passwd");
		
	}
	 

	
	public static void main(String[] args)
	{
		Test t=new Day8();
		
		t.display();
		t.method();
		Test.method1();
		
		
		
	}

	
	 

	

	
	

}

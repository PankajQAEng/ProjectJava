package Test;

public class Demo2 extends Demo1{
	
	void m1() 
	{
		super.m1();
		System.out.println("m1 method 2demo");
	}

	public static void main(String[] args) 
	{
		Demo2 obj=new Demo2();
		obj.m1();
		

	}

}

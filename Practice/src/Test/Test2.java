package Test;

public class Test2 implements Test1
{
	
	@Override
	public void demo() 
	{
		System.out.println("jai Bhole Nath");
		
	}
	public static void main(String[]args) 
	{
		Test1 obj=new Test2();
		obj.demo();
	}
	
	
	
	
	
	
	
	
	
	

}

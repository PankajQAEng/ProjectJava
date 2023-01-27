package Test;

public class Test3 {
	
	public boolean sleepIn(boolean weekday, boolean vacation) 
	{
		  if (!weekday || vacation) 
		  {
		    return true;
		  }
		  
		  return false;
	}

	public static void main(String[] args) 
	{
		
		Test3 obj=new Test3();
		obj.sleepIn(true, false);
		
	}

}

package Test;

public class StringCharacterExtract {

	public static void main(String[] args) 
	{
		String str="deepesh";
		char st='e';
		int count=0;
		//String[] split=str.split("");
		for(int i=1;i<str.length();i++) 
		{
			if(st==str.charAt(i)) 
			{
				count++;
			}
			
		}
		System.out.println(count);
	}		
}

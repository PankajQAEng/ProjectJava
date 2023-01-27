package Test;

import java.util.ArrayList;
import java.util.List;

public class ExtractString {

	public static void main(String[] args) 
	{
		
			String str = "Hey12this13is24Ram";
			
			int a=str.length();
			System.out.println(a);
			List<Character> list=new ArrayList<Character>();
			
			for(int i=0;i<a;i++)
			{
				list.add(str.charAt(i));
			}
			
		
			
			
			
	}

}

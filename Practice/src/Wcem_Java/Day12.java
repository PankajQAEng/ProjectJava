package Wcem_Java;

import java.util.HashSet;
import java.util.Set;

public class Day12 {

	public static void main(String[] args) 
	
	
	{
		Set sh=new HashSet();
		
		sh.add(123);
		sh.add(123);
		sh.add("Yuvraj");
		sh.add('S');
		sh.add(false);
		sh.add("Pankaja");
		
		
		System.out.println(sh);
		System.out.println(sh.remove('S'));
		
		for(Object l:sh) 
		{
			System.out.println(l);
		}
		
		
	}

}

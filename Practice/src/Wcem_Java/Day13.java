package Wcem_Java;

import java.util.HashMap;
import java.util.Map;

public class Day13 {

	public static void main(String[] args)
	
	
	{
		//map store value in the form of Key and Value pair
		
		
		Map<Integer,String> hp=new HashMap<Integer,String>();
		
		hp.put(105,"Yuvraj");
		hp.put(101,"Yuvraj");
		hp.put(102,"Param");
		hp.put(103,"Pankja");
		hp.put(104,"Yuvraj");
		hp.put(101,"Sachin");
		
		System.out.println(hp);

		
		System.out.println(hp.size());
		
		System.out.println(hp.get(103));
		
		System.out.println(hp.remove(105));
		
		hp.replace(102, "Virat");
		
		System.out.println(hp);
		
		
		
	}

}

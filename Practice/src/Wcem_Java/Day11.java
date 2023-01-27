package Wcem_Java;

import java.util.ArrayList;
import java.util.List;

public class Day11 {
	
	
	

	public static void main(String[] args) 
	
	{
	List al=new ArrayList();
	
          //Methods of arrayList
	
	al.add(101);
	
	al.add(10.5);
	
	al.add("Pankaj");
	
	al.add('A');
	
	al.add(true);
	
	al.add(101);
	
	//display method
	
	System.out.println(al);
	
	//index value
	
	System.out.println(al.get(1));//10.5
	
	// remove
	
	al.remove(1);
	
	System.out.println(al);
	
	al.add(2,105);
	
	System.out.println(al);
	
	System.out.println(al.size());
	
	//Normal for loop
	
	
	for(int i=0;i<al.size();i++) 
	{
		
		System.out.println(al.get(i));
	}
	
	//enhanced for loop
	
	for(Object m:al) 
	{
		
		System.out.println("value by enhanced"+" "+m);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	  
	}
}

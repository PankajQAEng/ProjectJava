package Wcem_Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;





public class Day9 {

	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	
	{
		
		Demo.show();
		
		String d="  WeLcomE";
		
		//String is sequence of character written in double quote
		
		//d.length();//number /integer
		
		System.out.println(d.length());
		
		System.out.println(d.trim());
		
		System.out.println(d);
		
		System.out.println(d.toUpperCase());//WELCOME
		
		System.out.println(d.toLowerCase());//welcome
		
		String c="Yuvraj";
		
		System.out.println(c.substring(1,5));//uvra
		
		System.out.println(d.concat(c));//welocmeYuvraj
		
		String e="Happy";
		
		System.out.println(d.concat(c).concat(e));
		
		String s="Maharaja";
		
		System.out.println(s.charAt(5));//a
		
		System.out.println(s.replace('a', 'p'));
		
		String f="Kajal Sayali Rashmi";
		
	    System.out.println(f.length());
	    
	   String w[]= f.split(" ");
	   
	   System.out.println(w[0]);
	   System.out.print(w[1]);
	   System.out.print(w[2]);
	   
	   System.out.println();
	   
	   String m="Selenium";
	   
	   String n="selenium";
	   
	   System.out.println(m.equals(n));//False boolean
	   
	   System.out.println(m.equalsIgnoreCase(n));
	   
	   System.out.println(m.endsWith("m"));//boolean true
	   
	   System.out.println(m.contains("p"));//
	   
	   
	  String  a []= {"Pankja","Yavraj"};//home
	   
	   
	   
	   ArrayList l= new ArrayList();
	   
	   l.add("Pankaj");
	   l.add(101);
	   l.add(12.45);
	   
	   System.out.println(l);
	   
	   
	  
	   
	  
		
		
		
		

		
		
		
		
		
	
		
		
		
		
	}

}

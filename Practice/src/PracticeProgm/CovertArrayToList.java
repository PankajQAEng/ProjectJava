package PracticeProgm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CovertArrayToList {

	public static void main(String[] args) 
	{
		
		String[] geeks = {"Rahul", "Utkarsh",
                "Shubham", "Neelam"};

            // Conversion of array to ArrayList
           // using Arrays.asList
           List al = new ArrayList (Arrays.asList(geeks));
            System.out.println(al);

              // Adding some more values to the List.
             al.add(1234);
             al.add(567);

               System.out.println(al);
               
               // Collections Method
               
               String[] geek = {"Rahul", "Utkarsh",
                       "Shubham", "Neelam"};

      List<String> al1 = new ArrayList<String>();

      // adding elements of array to arrayList.
      Collections.addAll(al1, geek);

      System.out.println(al1);
  
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
	    
	}
		
		
		
	}


